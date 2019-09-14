package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	
	public static void main(String[] args) {	
	
		List<Person> personList = Arrays.asList(
				new Person("Magesh", "Sivagnanam", 34),
				new Person("Juicy", "Mix", 23),
				new Person("Kart", "Aart", 15)
				);
		
		printConditionally(personList, (p)->p.getLastName().startsWith("S"),(p) -> System.out.println(p.getLastName()));
	
}

	
	/**
	 * This method accepts the Predicate interface as an argument 
	 * and the implementation of the test method is passed as an lambda expression
	 * @param persons
	 * @param predicate
	 */
	public static void printConditionally(List<Person> persons, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : persons) {
			 if(predicate.test(person)) {
				 consumer.accept(person);
			 }
		}	
	}

}
