package com.dhl.sds;

import java.io.File;

public class XmlParser {

	public static void main(String[] args) {
		
		File xmlFolder = new File("/Users/dhl/sdsparser/parser/XMLData");
		File[] xmlFiles = xmlFolder.listFiles();
		File xmlFile = xmlFiles[0];
	}

}
