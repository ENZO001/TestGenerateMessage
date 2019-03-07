package com.reading;

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
		File file = new File("F:\\Workspace\\JavaWorkspace2019\\02_2018_ToolWorkspace\\ReadingXML\\pom.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(file);
		NodeList nodeList = doc.getElementsByTagName("dependency");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			String haha = element.getAttribute("haha");
			System.out.println(haha);
		}
	}

}
