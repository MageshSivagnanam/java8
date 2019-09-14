package io.java8;

public class ClosureExample {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		doProcess(a, new Process() {
			@Override
			public void process(int i) {
				System.out.println(i);
				
			}
		});
		

		doProcess(a, (i) -> System.out.println(i+b));
		
	}

	
	private static void doProcess(int i, Process process)
	{
		process.process(i);
	}
	
	
	
	
	public interface Process {

		void process(int i);
	}
}
