package app;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.helpers.XMLReaderFactory;

import de.xplanung.xplangml._5._0.BPGeometrieobjektType;
import de.xplanung.xplangml._5._0.XPlanAuszugType;
import net.opengis.gml._3.AbstractGeometryType;
import net.opengis.gml._3.FeaturePropertyType;
import net.opengis.gml._3.LineStringType;

public class v5_Example {
	
	public v5_Example() {
		try
		{
			System.out.println("Unmarshalling started.\n");
			
			FileInputStream fileInputStream = new FileInputStream("gml_testdaten/v5_0_1/BP2070.gml");
			XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance(); 
			XMLStreamReader freader = xmlInputFactory.createXMLStreamReader(fileInputStream);
			
			// create JAXB context and instantiate unmarshaller
	        JAXBContext context = JAXBContext.newInstance("de.xplanung.xplangml._5._0");
	        Unmarshaller um = context.createUnmarshaller();

	        // get root of content tree via unmarshalling from xml file (type-safe)
	        Object o = um.unmarshal(freader);
	        
	        JAXBElement<XPlanAuszugType> root = null;
	        if ( o instanceof JAXBElement<?> ) {
	        	root = (JAXBElement<XPlanAuszugType>) o;
	        }
	        else {
	        	throw new Exception("Root Object is not castable to JAXBElement<XPlanAuszugType>");
	        }
	        XPlanAuszugType xpaType = root.getValue();
	        
	        
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
