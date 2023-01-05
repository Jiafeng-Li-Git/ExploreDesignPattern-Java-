package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		// lambda with arguments
		SumInterface summing = (int a, int b) -> {return a + b;};
		System.out.println(summing.sum(1, 2));
		
		// explore stream
		Integer[] intArray = new Integer[] {1, 2, 5, 9};
		Stream<Integer> intStream = Arrays.stream(intArray);
		
		List<String> shops = new ArrayList<String>();
		shops.add("Loblaws");
		shops.add("Farmboy");
		Stream<String> shopStream = shops.stream();
		System.out.println(shops);
		shopStream.sorted()
		.filter(shop -> shop.charAt(0)=='L')
		.forEach(shop -> System.out.println(shop));
		System.out.println(shops);
		
		List<String> newShops = shops.stream()
				.sorted()
				.filter(shop -> shop.charAt(0)=='L')
				.collect(Collectors.toList());
		System.out.println(newShops);
		
		Stream<String> letterStream = Stream.of("hello", " stream");
		
		
		
	}
}
