package com.sp.main;

import java.io.FileReader;
import java.io.FileWriter;

public class MainClass {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("input.txt");
			FileWriter fileWriter = new FileWriter("output.txt");
			int charData;
			while ((charData = fileReader.read()) != -1) {
				fileWriter.write(charData); // Write each character to the output file
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
