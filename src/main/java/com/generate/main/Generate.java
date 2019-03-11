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

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException {
		File messageXmlFile = new File("D:\\BUIT-個金\\大作業\\04_開發上相關\\99_法人開戶\\20190308_電文\\士豪負責\\下行\\tx067311d.xml");
		String workspaceDirectory = "D:\\Workspace2019\\BackEnd\\01_2018_ProblemWorkspace\\TestGenerateMessage";
		boolean isNeedForm = false; // 需要建Form嗎?
		
		String messageXmlFileName = messageXmlFile.getName(); // 給的xml名稱
		boolean isUpMessage = messageXmlFileName.contains("u"); // 如果有u就是上行，沒有就是下行
		String messageCode = messageXmlFileName.substring(2, 8); // 電文代號
		
		Map<String, Object> resultMap = AboutFile.createFile(workspaceDirectory, messageCode, isUpMessage, isNeedForm); // 建檔案
		
		if (isNeedForm) {
			GenerateFormJava.generateFormJava(resultMap, messageCode, messageXmlFile);
		}
		
		if (isUpMessage) { // 上行
			GenerateReqXml.generateReqXml(resultMap, messageCode, messageXmlFile);
			GenerateReqJava.generateReqJava(resultMap, messageCode, messageXmlFile);
		} else {
			GenerateRtnJava.generateRtnJava(resultMap, messageCode, messageXmlFile);
		}
	}

}
