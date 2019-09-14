package io.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava7 {

		
	public static void main(String[] args) {

		
		List<Person> personList = Arrays.asList(
				new Person("Magesh", "Sivagnanam", 34),
				new Person("Juicy", "Mix", 23),
				new Person("Kart", "Aart", 15)
				);
		

		Collections.sort(personList, new Comparator<Person>() {
					@Override
					public int compare(Person o1, Person o2) {
						 return o1.getLastName().compareTo(o2.getLastName());
						
					}
		});
		
		printAll(personList);
		
		
		//printLastNameBeginingWithS(personList);
		
		printConditionally(personList, new Condition() {
			
			@Override
			public boolean filterCondition(Person person) {
				 
				return person.getFirstName().startsWith("S");
				
			}
		});
		
		

		
		
	}
	
	public static void  printAll(List<Person> persons ) {
		for (Person person : persons) {
			System.out.println(person.getLastName());
		}		
	}
	
	
	public static void printLastNameBeginingWithS(List<Person> persons) {
		
		for (Person person : persons) {
			
			if(person.getLastName().startsWith("S")) {
				System.out.println("Last Name Starts with S " );
				System.out.println(person.getLastName() );
				
			}
		}	
		
	}
	
	
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
