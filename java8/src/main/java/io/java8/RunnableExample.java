package io.java8;

public class RunnableExample {

	public static void main(String[] args) {

		
		Thread lamdaThread = new Thread( () -> 
			{
				System.out.println("Runnable Lamda"); 
			});
		lamdaThread.run(); 
		

	}

}
