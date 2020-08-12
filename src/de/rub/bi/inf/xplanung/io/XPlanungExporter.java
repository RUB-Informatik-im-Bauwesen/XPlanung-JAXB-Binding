package de.rub.bi.inf.xplanung.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XPlanungExporter {
	
	public void saveToFile(String path, Object xmlRoot) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance("de.xplanung.xplangml._4._1");

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.xplanung.de/xplangml/4/1");
			marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "http://www.xplanung.de/xplangml/4/1");
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper",
					new CustomNamespacePrefixMapper());
			
			

			OutputStream outputStream = new FileOutputStream(path);
			marshaller.marshal(xmlRoot, outputStream);

		} catch (JAXBException | FileNotFoundException e2) {
			e2.printStackTrace();
		}
	}

}
