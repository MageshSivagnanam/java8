package io.java8;

public class MethodReferenceExample1 {


	public static void main(String[] args) {

		Thread thread = new Thread(() -> printMessage());
		thread.start();
		
		// MethodReferenceType
		Thread refThread = new Thread(MethodReferenceExample1 :: printMessage);
		refThread.start();
		
		
	}
	
	
	public static void printMessage() {
		System.out.println("Hello");
	}
	

}
