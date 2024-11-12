package com.sp.main;

import java.io.File;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		File file = new File("example.txt");

		try {
			// Create new File
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName()); // Get file name
			} else {
				System.out.println("File already exists.");
			}

			// Get file information
			System.out.println("Path: " + file.getPath()); // File path
			System.out.println("Absolute Path: " + file.getAbsolutePath()); // File absolute or Details path
			System.out.println("Readable: " + file.canRead()); // Can File Read
			System.out.println("Writable: " + file.canWrite()); // Can File Write
			System.out.println("Size: " + file.length()); // Showing File length

			// Delete the file
			if (file.delete()) {
				System.out.println("File deleted.");
			} else {
				System.out.println("Failed to delete the file.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
