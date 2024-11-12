package com.sp.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {
	public static void main(String[] args) {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
				DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {

			// Write data
			dos.writeInt(123);
			dos.writeDouble(456.78);
			dos.writeBoolean(true);

			// Read data
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
