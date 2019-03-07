package com.reading;

public class GenUppToLow {

	public static void main(String[] args) {
		String input = "PCMS_FLOW_BRANCH, PCMS_FLOW_MAIN";
		String[] inputArray = input.split(",");

		for (int i = 0; i < inputArray.length; i++) {
			String[] lowerInputArray = inputArray[i].toLowerCase().split("_");
			String temp = "";
			for (int j = 0; j < lowerInputArray.length; j++) {
				if (j == 0) {
					temp += lowerInputArray[j].trim();
				} else {
					String firstWord = new StringBuilder().append("").append(lowerInputArray[j].charAt(0)).toString();
					temp += lowerInputArray[j].replaceFirst(firstWord, firstWord.toUpperCase());
				}
			}
			System.out.println(temp);
		}
	}

}
