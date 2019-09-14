package io.java8;

public class TypeInferenceExample {
	
	
	public static void main(String[] args) {

		//StringLengthLamda inferenceLamda = (s) -> s.length(); 

		//System.out.println(inferenceLamda.getStringLength("Hello"));
		getStrLen((s) -> s.length());
		
		
	}
	
	
	public static void getStrLen(StringLengthLamda lengthLamda ) {
		
		System.out.println(lengthLamda.getStringLength("Hello"));
	}
	
	
	interface StringLengthLamda {
		int getStringLength(String s);
	}

}
