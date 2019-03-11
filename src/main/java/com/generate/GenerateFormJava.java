package com.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GenerateFormJava {
	
	public static void generateFormJava(Map<String, Object> resultMap, String messageCode, File messageXmlFile) throws IOException, ParserConfigurationException, SAXException {
		
		String formJavaPath = (String) resultMap.get(AboutFile.FORM_JAVA_PATH);
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(formJavaPath)));
		writer.println("package com.ctbcbank.pcms.form;");
		writer.println();
		writer.println("import com.ctbcbank.pcms.htg.BaseForm;");
		writer.println();
		writer.println("public class Form" + messageCode +" extends BaseForm {");
		writer.println();
		writer.println("private static final long serialVersionUID = 1L;");
		writer.println();
		
		String[] parameterArray = getAllPatameter(messageXmlFile);
		for (int i = 0; i < parameterArray.length; i++) {
			
			if (parameterArray[i] != null) {
				writer.println(parameterArray[i]);
			}
			
		}
		
		writer.println("}");
		writer.close();
		
		System.out.println("Generate Form Java finish.");
	}
	
	private static String[] getAllPatameter(File messageXmlFile) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(messageXmlFile);
		NodeList nodeList = doc.getElementsByTagName("contentData");

		String[] idArray = new String[nodeList.getLength()];
		String[] parameterArray = new String[nodeList.getLength()]; 

		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			String id = element.getAttribute("id");
			idArray[i] = id;
		}
		
		for (int i = 0; i < idArray.length; i++) {
			if ("OUTPUT_CODE".equals(idArray[i]) || "MSG".equals(idArray[i]) || "outputCode".equals(idArray[i])) {
				continue;
			}
			
			String[] lowerInputArray = idArray[i].toLowerCase().split("_");
			String temp = "";
			for (int j = 0; j < lowerInputArray.length; j++) {
				if (j == 0) {
					temp += lowerInputArray[j].trim();
				} else {
					String firstWord = new StringBuilder().append("").append(lowerInputArray[j].charAt(0)).toString();
					temp += lowerInputArray[j].replaceFirst(firstWord, firstWord.toUpperCase()).trim();
				}
			}
			parameterArray[i] = "private String " + temp + ";";
		}
		
		return parameterArray;
	}
}
