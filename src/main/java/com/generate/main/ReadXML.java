package com.generate.main;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File file = new File("D:\\BUIT-個金\\大作業\\04_開發上相關\\99_法人開戶\\20190308_電文\\全部電文\\下行\\tx067311d.xml");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(file);
		NodeList nodeList = doc.getElementsByTagName("contentData");

		String[] idArray = new String[nodeList.getLength()];

		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			String id = element.getAttribute("id");
			System.out.println(id);

			idArray[i] = id;
		}

		System.out.println("======================================================================");
	}

}
