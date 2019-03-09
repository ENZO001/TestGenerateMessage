package com.generate;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AboutFile {
	
	public static final String XML_FILE_PATH = "XML_FILE_PATH";
	public static final String FORM_JAVA_PATH = "FORM_JAVA_PATH";
	public static final String REQ_JAVA_PATH = "REQ_JAVA_PATH";
	public static final String RTN_JAVA_PATH = "RTN_JAVA_PATH";

	public static Map<String, Object> createFile(String workspaceDirectory, String messageCode, boolean isUpMessage, boolean isNeedForm) throws IOException {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		File createFile = null;
		boolean createSuccess = false;
		
		String formFilePath = workspaceDirectory + "\\src\\main\\java\\com\\ctbcbank\\pcms\\form\\Form" + messageCode + ".java";
		createFile = new File(formFilePath);
		
		resultMap.put(FORM_JAVA_PATH, formFilePath);
		if (isNeedForm) {
//			if (createFile.exists() == false) {
				createSuccess = createFile.createNewFile();
				System.out.println("Create Form" + messageCode + ".java Success = " + createSuccess);
//			}
		}

		if (isUpMessage) { // 上行需要 XML + REQ
			String xmlFilePath = workspaceDirectory + "\\src\\main\\webapp\\WEB-INF\\htg\\req\\req" + messageCode + ".xml";
			createFile = new File(xmlFilePath);
			resultMap.put(XML_FILE_PATH, xmlFilePath);
//			if (createFile.exists() == false) {
				createSuccess = createFile.createNewFile();
				System.out.println("Create req" + messageCode + ".xml Success = " + createSuccess);
//			}

			String reqJavaPath = workspaceDirectory + "\\src\\main\\java\\com\\ctbcbank\\pcms\\req\\Req" + messageCode + ".java";
			createFile = new File(reqJavaPath);
			resultMap.put(REQ_JAVA_PATH, reqJavaPath);
//			if (createFile.exists() == false) {
				createSuccess = createFile.createNewFile();
				System.out.println("Create Req" + messageCode + ".java Success = " + createSuccess);
//			}

		} else { // 下行需要RTN
			String rtnJavaPath = workspaceDirectory + "\\src\\main\\java\\com\\ctbcbank\\pcms\\rtn\\Rtn" + messageCode + ".java";
			createFile = new File(rtnJavaPath);
			resultMap.put(RTN_JAVA_PATH, rtnJavaPath);
//			if (createFile.exists() == false) {
				createSuccess = createFile.createNewFile();
				System.out.println("Create Rtn" + messageCode + ".java Success = " + createSuccess);
//			}
		}
		
		return resultMap;
	}
}
