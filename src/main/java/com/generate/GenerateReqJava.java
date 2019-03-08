package com.generate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GenerateReqJava {

	public static void generateReqJava(Map<String, Object> resultMap, String messageCode, File messageXmlFile)
			throws IOException, ParserConfigurationException, SAXException {

		String reqJavaPath = (String) resultMap.get(AboutFile.REQ_JAVA_PATH);
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(reqJavaPath)));
		writer.println("package com.ctbcbank.pcms.req;");
		writer.println();

		writer.println("import org.dom4j.Document;");
		writer.println("import org.dom4j.Element;");
		writer.println("import org.springframework.stereotype.Service;");
		writer.println();

		writer.println("import com.ctbcbank.pcms.form.Form" + messageCode + ";");
		writer.println("import com.ctbcbank.pcms.htg.BaseForm;");
		writer.println();

		writer.println("@Service");
		writer.println("public final class Req" + messageCode + " extends ReqBase {");
		writer.println();

		writer.println("@Override");
		writer.println(
				"public Document fillxmlValue(Document document, BaseForm form, String sessionId) throws Exception {");
		writer.println();

		writer.println("Element element;");
		writer.println();

		writer.println("if (form instanceof Form" + messageCode + ") {");
		writer.println("Form" + messageCode + " fm = (Form" + messageCode + ") form;");
		writer.println();

		writer.println("// set session id");
		writer.println("element = (Element) document.selectSingleNode(\"hostgateway/header/data[@id='sessionId']\");");
		writer.println("element.addAttribute(\"value\", sessionId);");
		writer.println();

		Map<String, Object> needArrayMap = getAllPatameter(messageXmlFile);
		String[] idArray = (String[]) needArrayMap.get("ID_ARRAY");
		String[] parameterArray = (String[]) needArrayMap.get("PARAMETER_ARRAY");
		
		for (int i = 0; i < idArray.length; i++) {
			writer.println("element = (Element) document.selectSingleNode(\"hostgateway/body/data[@id='" + idArray[i] + "']\");");
			writer.println("element.addAttribute(\"value\", fm.get" + parameterArray[i] + "());");
			writer.println();
		}
		writer.println("}");
		writer.println("return document;");
		writer.println("}");
		writer.println("}");
		writer.close();

		System.out.println("Generate Req Java finish.");
	}

	private static Map<String, Object> getAllPatameter(File messageXmlFile)
			throws ParserConfigurationException, SAXException, IOException {

		Map<String, Object> needArrayMap = new HashMap<String, Object>();

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
		needArrayMap.put("ID_ARRAY", idArray);

		for (int i = 0; i < idArray.length; i++) {
			String[] lowerInputArray = idArray[i].toLowerCase().split("_");
			String temp = "";
			for (int j = 0; j < lowerInputArray.length; j++) {
				if (j == 0) {
					String firstWord = new StringBuilder().append("").append(lowerInputArray[j].charAt(0)).toString();
					temp += lowerInputArray[j].replaceFirst(firstWord, firstWord.toUpperCase()).trim();
				} else {
					String firstWord = new StringBuilder().append("").append(lowerInputArray[j].charAt(0)).toString();
					temp += lowerInputArray[j].replaceFirst(firstWord, firstWord.toUpperCase()).trim();
				}
			}
			parameterArray[i] = temp;
		}
		needArrayMap.put("PARAMETER_ARRAY", parameterArray);

		return needArrayMap;
	}
}
