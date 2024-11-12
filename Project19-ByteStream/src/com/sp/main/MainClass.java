package com.sp.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("input.txt");
			FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
			int byteData;
			while ((byteData = fileInputStream.read()) != -1) {
				fileOutputStream.write(byteData); // Write each byte to the output file
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
