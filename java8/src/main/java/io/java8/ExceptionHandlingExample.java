package io.java8;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		
		 int [] valueNumbers = {1,4,6,7};
		 
		 int key = 0 ;
		 

		 process( valueNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k) ));	 
		 

	}
	
	
	private static void process (int [] value,int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : value) {
			consumer.accept(i, key);
		}
	}

	
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		 return (v,k) -> {
			  try {
				 biConsumer.accept(v, k);
			  }
			  catch (Exception e) {
				System.out.println("Exception occured in the Wrapper lambda " + e.getMessage());
			  }
		 };
		
	}
}
