package com.sp.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data); // Write data to output file
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
