package io.java8;

public class Greeter {

	
	public void callGreet(MyLamdaGreet greet ) {
		greet.greet();
	}
	
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		//MyLamdaGreet helloWorldGreet = new HelloGreetingImpl();
		
		//greeter.callGreet(helloWorldGreet);
		
		//helloWorldGreet.greet();
		
		// Lamda Greeting implementation
		
		MyLamdaGreet	lamdaGreet = () -> System.out.println("Hello World");
		
		lamdaGreet.greet();
		
		// Ananymous class implementation
		
		MyLamdaGreet lamdaGreet2 = new MyLamdaGreet() {
			@Override
			public void greet() {
					System.out.println("Hello World");
			}
		};
		
		lamdaGreet2.greet();
		
		
	}

	

}
	
