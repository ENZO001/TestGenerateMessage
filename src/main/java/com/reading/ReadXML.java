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
		File file = new File("D:\\BUIT-個金\\大作業\\04_開發上相關\\99_法人開戶\\20190308_電文\\士豪負責\\行\\tx002000d.xml");

		boolean isUMessage = file.getName().contains("u");

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

		for (int i = 0; i < idArray.length; i++) {
			System.out.print(idArray[i] + ",");
		}

		System.out.println("======================================================================");
		System.out.println("======================================================================");

		if (isUMessage) {
			printDataXml(idArray);
			System.out.println();
			System.out.println("======================================================================");
			System.out.println();
			printReq(idArray);
		} else {
			printRtn(idArray);
		}

	}

	private static void printDataXml(String[] idArray) {
		for (int i = 0; i < idArray.length; i++) {
			System.out.println("<data id=\"" + idArray[i] + "\" value=\"\" />");
		}
	}

	private static void printReq(String[] idArray) {
		for (int i = 0; i < idArray.length; i++) {
			System.out.println("element = (Element) document.selectSingleNode(\"hostgateway/body/data[@id='"
					+ idArray[i] + "']\");");
			System.out.println("element.addAttribute(\"value\", fm.());");
			System.out.println();
		}
	}

	private static void printRtn(String[] idArray) {
		for (int i = 0; i < idArray.length; i++) {
			System.out
					.println("elementValue = (Element) document.selectSingleNode(\"hostgateway/line/msgBody/data[@id='"
							+ idArray[i] + "']\");");
			System.out.println("if (elementValue != null) {");
			System.out.println("fm.setCifNo(document.valueOf(\"hostgateway/line[@no='\" + j + \"']/msgBody/data[@id='"
					+ idArray[i] + "']/@value\"));");
			System.out.println("}");
			System.out.println();
		}
	}
}
