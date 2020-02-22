package com.java.examples;
/* static method are called on class reference and non static method are called on object */
abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
	
	public void Read() {
		System.out.println("Reading...");
	}
	
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
	
	public void Read() {
		System.out.println("Reading Book...");
	}
}

public class overRiding extends Writer {
	public static void write() {
		System.out.println("OverWriting code");
	}
	
	public void Read() {
		System.out.println("OverReading Book...");
	}

	public static void main(String[] args) {
		Writer w = new overRiding();
		w.write();  //its nothing but Writer.write();
		w.Read();
	}
}
