package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.opengis.gml._3.AbstractFeatureCollectionType;
import net.opengis.gml._3.AbstractGeometryType;
import net.opengis.gml._3.FeaturePropertyType;
import net.opengis.gml._3.GeometryPropertyType;
import net.opengis.gml._3.LineStringType;

public class VersionSelection {
	
	public VersionSelection() {
		try
		{
			System.out.println("Unmarshalling started.\n");
			
			FileInputStream fis = new FileInputStream(new File("gml_testdaten/v4_1/xplan.gml"));
			
		    JAXBContext context = null; 
	
			XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance(); 
			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fis);
			while (xmlStreamReader.hasNext()) { 
			   
			   switch (xmlStreamReader.getEventType()) {
			   case XMLStreamConstants.START_ELEMENT:
					if(xmlStreamReader.getLocalName().contains("XPlanAuszug")){
						for ( int i = 0; i < xmlStreamReader.getAttributeCount(); i++ ) {
							
						    if(xmlStreamReader.getAttributeLocalName(i).equals("schemaLocation")) {
						    	String schemaLocation = xmlStreamReader.getAttributeValue(i);
						    	if (schemaLocation.contains("/5/")){
						    		context = JAXBContext.newInstance("de.xplanung.xplangml._5._0");
						    	}
						    	else if (schemaLocation.contains("/4/")) {
						    		context = JAXBContext.newInstance("de.xplanung.xplangml._4._1");
						    	}
						    }
							
						}

					}
					break;

				default:
					break;
				}
			   
			   xmlStreamReader.next();
			}
			
			
			if(context == null)
				throw new Exception("Cannot determine the Version of XPlanung File! Please ensure a valid schemaLocation attribute");
			
		    Unmarshaller um = context.createUnmarshaller();

	        // get root of content tree via unmarshalling from xml file (type-safe)
		    fis = new FileInputStream(new File("gml_testdaten/v4_1/xplan.gml"));
		    XMLStreamReader freader = xmlInputFactory.createXMLStreamReader(fis);
	        Object o = um.unmarshal(freader);
	        
	        JAXBElement<AbstractFeatureCollectionType> root = null;
	        if ( o instanceof JAXBElement<?> ) {
	        	root = (JAXBElement<AbstractFeatureCollectionType>) o;
	        }
	        else {
	        	throw new Exception("Root Object is not castable to JAXBElement<XPlanAuszugType>");
	        }
	        AbstractFeatureCollectionType xpaType = root.getValue();
	        
	        
	        // process content tree
	        List<FeaturePropertyType> members = xpaType.getFeatureMember();
	        
	        for (FeaturePropertyType feature : members) {
	        	
	        	if(feature.getAbstractFeature().getValue() instanceof de.xplanung.xplangml._4._1.BPGeometrieobjektType
	        			|| feature.getAbstractFeature().getValue() instanceof de.xplanung.xplangml._5._0.BPGeometrieobjektType) {
	        		
	        		
	        	       GeometryPropertyType position = (GeometryPropertyType) 
	        	    		feature.getAbstractFeature().getValue().getClass().getMethod("getPosition")
	        	    		.invoke(feature.getAbstractFeature().getValue());
	        		
	        	       
	        	       
	        		
	        			AbstractGeometryType agType = position.getAbstractGeometry().getValue();
//	        	
	        			System.out.println(agType.getClass().getSimpleName());
	        			
	        			if(agType instanceof LineStringType) {
	        				LineStringType line = (LineStringType)agType;
	        				
	        				System.out.println(line.getPosList().getValue().toString());
	        			}
	        	
	        	}
	        	
	        
	        }
	        System.out.println("\nUnmarshalling executed successfully.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
