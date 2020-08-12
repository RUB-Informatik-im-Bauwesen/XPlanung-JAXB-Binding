package de.rub.bi.inf.xplanung.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import de.xplanung.xplangml._4._1.BPGeometrieobjektType;
import de.xplanung.xplangml._4._1.XPlanAuszugType;
import net.opengis.gml._3.AbstractFeatureCollectionType;
import net.opengis.gml._3.AbstractGeometryType;
import net.opengis.gml._3.FeaturePropertyType;
import net.opengis.gml._3.LineStringType;

public class v4_Example {
	
	public v4_Example() {
		try   //TODO more efficient file reading!
		{
	
			System.out.println("Unmarshalling started.\n");
			
			// create JAXB context and instantiate unmarshaller
	        JAXBContext context = JAXBContext.newInstance("de.xplanung.xplangml._4._1");
	        Unmarshaller um = context.createUnmarshaller();

	        // get root of content tree via unmarshalling from xml file (type-safe)
	       
	  
	        
	        FileInputStream fis = new FileInputStream(new File("gml_testdaten/v4_1/xplan.gml"));
	        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance(); 
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
//	        
//	        
	        // process content tree
	        List<FeaturePropertyType> members = xpaType.getFeatureMember();
	        
	        for (FeaturePropertyType feature : members) {
	        	
	        	if(feature.getAbstractFeature().getValue() instanceof BPGeometrieobjektType) {
	        		BPGeometrieobjektType bpObjektType = (BPGeometrieobjektType)feature.getAbstractFeature().getValue();
	        		
	        		System.out.println(bpObjektType.getPosition().getAbstractGeometry().getValue().getClass().getSimpleName());
	        		if(bpObjektType.getPosition().getAbstractGeometry().getValue() instanceof AbstractGeometryType) {
	        			AbstractGeometryType agType = (AbstractGeometryType)bpObjektType.getPosition().getAbstractGeometry().getValue();
	        	
	        			if(agType instanceof LineStringType) {
	        				LineStringType line = (LineStringType)agType;
	        				
	        				System.out.println(line.getPosList().getValue().toString());
	        			}
	        		}
	        	}
	        	
	        	//System.out.println("----------");
	        	//System.out.println(feature.toString());
//	            System.out.println(feature.getTitle());
//	            System.out.println(feature.getClass());
	        }
	        System.out.println("\nUnmarshalling executed successfully.");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
