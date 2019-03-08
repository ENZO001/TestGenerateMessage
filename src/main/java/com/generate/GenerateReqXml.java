package com.generate;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GenerateReqXml {

	public static void generateReqXml(Map<String, Object> resultMap, String messageCode, File messageXmlFile)
			throws ParserConfigurationException, TransformerException, SAXException, IOException {
		String xmlFilePath = (String) resultMap.get(AboutFile.XML_FILE_PATH);

		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

		Document document = documentBuilder.newDocument();

		// root element
		Element root = document.createElement("hostgateway");
		document.appendChild(root);

//		============================ <header> start ============================
		// header element
		Element header = document.createElement("header");
		root.appendChild(header);

//		<action type="transaction" />
		Element element = document.createElement("action");
		header.appendChild(element);
		Attr attr = document.createAttribute("type");
		attr.setValue("transaction");
		element.setAttributeNode(attr);

//		<data id="sessionId" value="" />
		element = document.createElement("data");
		header.appendChild(element);
		attr = document.createAttribute("id");
		attr.setValue("sessionId");
		element.setAttributeNode(attr);
		attr = document.createAttribute("value");
		attr.setValue("");
		element.setAttributeNode(attr);

//		<data id="applicationId" value="default" />
		element = document.createElement("data");
		header.appendChild(element);
		attr = document.createAttribute("id");
		attr.setValue("applicationId");
		element.setAttributeNode(attr);
		attr = document.createAttribute("value");
		attr.setValue("default");
		element.setAttributeNode(attr);

//		<data id="luType" value="LU62" />
		element = document.createElement("data");
		header.appendChild(element);
		attr = document.createAttribute("id");
		attr.setValue("luType");
		element.setAttributeNode(attr);
		attr = document.createAttribute("value");
		attr.setValue("LU62");
		element.setAttributeNode(attr);

//		<data id="transactionId" value="067005" />
		element = document.createElement("data");
		header.appendChild(element);
		attr = document.createAttribute("id");
		attr.setValue("transactionId");
		element.setAttributeNode(attr);
		attr = document.createAttribute("value");
		attr.setValue(messageCode);
		element.setAttributeNode(attr);
//		============================ <header> end ============================

//		============================ <body> start ============================
		Element body = document.createElement("body");
		root.appendChild(body);

		String[] idArray = getIdArray(messageXmlFile);
		for (int i = 0; i < idArray.length; i++) {
			element = document.createElement("data");
			body.appendChild(element);

			attr = document.createAttribute("id");
			attr.setValue(idArray[i]);
			element.setAttributeNode(attr);

			attr = document.createAttribute("value");
			attr.setValue("");
			element.setAttributeNode(attr);
		}
// 		============================ <body> start ============================

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource domSource = new DOMSource(document);
		StreamResult streamResult = new StreamResult(new File(xmlFilePath));

		transformer.transform(domSource, streamResult);

		System.out.println("Generate Req XML finish.");
	}

	private static String[] getIdArray(File messageXmlFile)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(messageXmlFile);
		NodeList nodeList = doc.getElementsByTagName("contentData");

		String[] idArray = new String[nodeList.getLength()];

		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			String id = element.getAttribute("id");
			idArray[i] = id;
		}

		return idArray;
	}

}
