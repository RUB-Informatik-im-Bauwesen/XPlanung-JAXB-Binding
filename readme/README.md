# XPlanung-JAXB-Binding #

Build Java Classes of XSD files via JAXB.
This Project defines the bindings needed to build the classes for XPlanung-XSD-files.
Then execute (un)marshalling as wished.


## TL;DR: ##

1. Auto-Generate Java Source Files:

	1.1 Generate GML 5_0 files:
	
	    1.1.1 move to eclipse project folder (in CLI)
	
	    1.1.2 xjc -d src schemata/XPlanGML_5_0_Schemata/XPlanung-Operationen.xsd -b bindings.xsd -encoding utf8
	
	1.2 Generate GML 4_1 files:
	
	    1.2.1 Create folder 'tmp'
	
	    1.2.2 xjc -d tmp schemata/XPlanGML_4_1_Kernmodell-Schemata/XPlanung-Operationen.xsd -b bindings_4_1.xsd -encoding utf8

	    1.2.3 from tmp delete everything but de.xplanung.xplangml._4._1
	    
	    1.2.4 cut/copy de.xplanung.xplangml._4._1 into src folder (overwrite what's there)
	    
	    1.2.5 delete folder 'tmp' if you want to
	

2. Execute 'Main app' for a demo of unmarshalling (under different GML versions):

	2.1. Execute Main.java
	
	2.2. Examine console output



## Details ##

### 1. Creating Java Classes via CLI: ###

**xjc [options] {xsd_file} -b {bindings-file}**

- {xsd_file} should be "XPlanung-Operationen.xsd" since that file includes/imports all the other necessaray files.

- {bindings-file} should be "bindings.xsd" which defines the JAXB-bindings needed in order to compile xlink.xsd from http://www.w3.org/1999/xlink.xsd
which is needed for compiling the schema files in this project.

- [options]:
  - z.B. -encoding utf8

**Useful options:**

- -d {dir}
  - {dir} should be the "src"-directory of your eclipse java project
  
- -p {package}
  - {package} determines the java package the java files will be generated into
  - **WARNING** usage of -p may cause errors - in that case, just do not use it and - if needed - manually create your package structure afterwards
