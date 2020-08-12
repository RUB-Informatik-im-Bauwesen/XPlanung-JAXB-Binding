package de.rub.bi.inf.xplanung.io;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;




public class CustomNamespacePrefixMapper extends NamespacePrefixMapper {

	private Map<String, String> namespaceMap = new HashMap<String, String>();
	
	public CustomNamespacePrefixMapper() {
		namespaceMap.put("http://www.xplanung.de/xplangml/4/1", "xplan");
		namespaceMap.put("http://www.opengis.net/gml/3.2", "gml");
		namespaceMap.put("http://www.w3.org/1999/xlink", "xlink");
		namespaceMap.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
		namespaceMap.put("http://www.opengis.net/wfs", "wfs");		
	}
	
	
	
	@Override
	public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
		return namespaceMap.getOrDefault(arg0, arg1);
	}


}
