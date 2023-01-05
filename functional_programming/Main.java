package functional_programming;

public class Main {
	
	public static void main(String[] args) {
		
		// using a class implementing interface
		GreetingInterface greeting = new Greeting();
		greeting.sayHello();
		
		// functional interface
		GreetingInterface greeting2 = new GreetingInterface() {
			@Override
			public void sayHello() {
				System.out.println("Hello functional interface");
			}
		};
		greeting2.sayHello();
		
		// lambda
		GreetingInterface greeting3 = () -> System.out.println("Hello Lambda");
		greeting3.sayHello();
		
		//lambda with arguments
		SumInterface summing = (int a, int b) -> {return a + b;};
		System.out.println(summing.sum(1, 2));
	}
}
