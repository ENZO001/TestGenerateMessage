package com.generate.main;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.generate.AboutFile;
import com.generate.GenerateFormJava;
import com.generate.GenerateReqJava;
import com.generate.GenerateReqXml;
import com.generate.GenerateRtnJava;

public class Generate {

	public static void main(String[] args)
			throws IOException, ParserConfigurationException, TransformerException, SAXException {
		File messageXmlFile = new File("D:\\BUIT-個金\\大作業\\04_開發上相關\\99_法人開戶\\20190308_電文\\全部電文\\上行\\tx062000u.xml");
		String workspaceDirectory = "D:\\Workspace\\PCMS_201812_Workspace\\pcms";
		boolean isNeedForm = true; // 是否需要建Form
		generate(messageXmlFile, workspaceDirectory, isNeedForm);
	}

	private static void generate(File messageXmlFile, String workspaceDirectory, boolean isNeedForm)
			throws IOException, ParserConfigurationException, TransformerException, SAXException {
		String messageXmlFileName = messageXmlFile.getName(); // 給的xml名稱
		boolean isUpMessage;
		
		if (messageXmlFileName.contains("u")) { // 檔名如果有u就是上行
			isUpMessage = true;
		} else if (messageXmlFileName.contains("d")) { // 檔名如果有d就是下行
			isUpMessage = false;
		} else {
			System.out.println("無法判定是上下行，請確認檔名");
			return;
		}
		
		String messageCode = messageXmlFileName.substring(2, 8); // 電文代號

		Map<String, Object> resultMap = AboutFile.createFile(workspaceDirectory, messageCode, isUpMessage, isNeedForm); // 建檔案

		if (isNeedForm) {
			GenerateFormJava.generateFormJava(resultMap, messageCode, messageXmlFile);
		}

		if (isUpMessage) { // 上行
			GenerateReqXml.generateReqXml(resultMap, messageCode, messageXmlFile);
			GenerateReqJava.generateReqJava(resultMap, messageCode, messageXmlFile);
			
		} else { // 下行
			GenerateRtnJava.generateRtnJava(resultMap, messageCode, messageXmlFile);
		}
	}

}
