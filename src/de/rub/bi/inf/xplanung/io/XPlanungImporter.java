package de.rub.bi.inf.xplanung.io;

import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

import net.opengis.gml._3.AbstractFeatureCollectionType;

public class XPlanungImporter {
	
	private Listener unmarshallListener;
	
	public XPlanungImporter() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public JAXBElement<AbstractFeatureCollectionType> readFromFile(String path) throws Exception {
		

		System.out.println("Unmarshalling started.");
	
		InputStream fis = new FileInputStream(path);
		
	    JAXBContext context = null; 
	
	    String versionInfo = "none";
	    
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance(); 
		XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fis);
		while (xmlStreamReader.hasNext()) { 
		   
		   switch (xmlStreamReader.getEventType()) {
		   case XMLStreamConstants.START_ELEMENT:
				if(xmlStreamReader.getLocalName().contains("XPlanAuszug")){
					for ( int i = 0; i < xmlStreamReader.getAttributeCount(); i++ ) {
						
					    if(xmlStreamReader.getAttributeLocalName(i).equals("schemaLocation")) {
					    	String schemaLocation = xmlStreamReader.getAttributeValue(i);
					    	if (schemaLocation.contains("/5/1")){
					    		context = JAXBContext.newInstance("de.xplanung.xplangml._5._1");
					    		System.out.println("Using de.xplanung.xplangml._5._1");
					    		versionInfo = "de.xplanung.xplangml._5._1";
					    	}
					    	else
					    	if (schemaLocation.contains("/5/")){
					    		context = JAXBContext.newInstance("de.xplanung.xplangml._5._0");
					    		System.out.println("Using de.xplanung.xplangml._5._0");
					    		versionInfo = "Using de.xplanung.xplangml._5._0";
					    	}
					    	else if (schemaLocation.contains("/4/")) {
					    		context = JAXBContext.newInstance("de.xplanung.xplangml._4._1");
					    		System.out.println("Using de.xplanung.xplangml._4._1");
					    		versionInfo = "Using de.xplanung.xplangml._4._1";
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
		
		if(unmarshallListener!=null)
			um.setListener(unmarshallListener);
	
		fis = new FileInputStream(path);
				
		XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(fis);
	    Object o = um.unmarshal(reader);
	
		JAXBElement<AbstractFeatureCollectionType> root = null;
		if (o instanceof JAXBElement<?>) {
			root = (JAXBElement<AbstractFeatureCollectionType>) o;
		} else {
			throw new Exception("Root Object is not castable to JAXBElement<XPlanAuszugType>");
		}
		
		return root;
	}

}
