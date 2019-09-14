package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava8 {

		
	public static void main(String[] args) {

		
		List<Person> personList = Arrays.asList(
				new Person("Magesh", "Sivagnanam", 34),
				new Person("Juicy", "Mix", 23),
				new Person("Kart", "Aart", 15)
				);
		

		Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
		
		
		//printAll(personList);
		
		
		//printLastNameBeginingWithS(personList);
		
		printConditionally(personList, (p)-> true);
		
		printConditionally(personList, (p)->p.getLastName().startsWith("S"));
		
		
		

		
		
	}
	
/*	public static void  printAll(List<Person> persons ) {
		for (Person person : persons) {
			System.out.println(person.getLastName());
		}		
	}
	*/
	

	
	public static void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			 if(condition.filterCondition(person)) {
				 System.out.println(person.getLastName());
			 }
		}	
	}
	
	
	
	interface Condition {
		boolean filterCondition(Person person);
	}
	
	
	
}
