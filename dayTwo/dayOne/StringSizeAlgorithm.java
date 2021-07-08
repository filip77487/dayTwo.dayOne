package dayTwo.dayOne;

import java.util.List;

public class StringSizeAlgorithm {

	public static int stringChar(String str) {
		return str.length();
	}

	public void someAlgorithmOne(List<Integer> numbers) { // O(n^0)
		System.out.println(numbers.get(0));
	}

	public void someAlgorithmTwo(List<Integer> numbers) { // O(n^1)
		for (Integer number : numbers) {
			System.out.println(number);

		}
	}

	public void someAlgorithmThree(List<Integer> numbers) { // O(n^2)
		for (Integer number : numbers) {
			System.out.println(number);
			for (Integer integer : numbers) {
				System.out.println(integer);
			}

		}
	}
	public void someAlgorithmFour(List<Integer> numbers) { // O(n^3)
		for (Integer number : numbers) {
			System.out.println(number);
			for (Integer integer : numbers) {
				System.out.println(integer);
				for (Integer integer2 : numbers) {
					System.out.println(integer2);
				}

			}
		}
	}


	public void someAlgorithmFive(List<Integer> numbers) { // O(n^3)
		for (Integer number : numbers) {
			System.out.println(number);
			for (Integer integer : numbers) {
				System.out.println(integer);
				for (Integer integer2 : numbers) {
					System.out.println(integer2);
				}

			}
		}
	
		for (Integer number : numbers) {
			System.out.println(number);
			for (Integer integer : numbers) {
				System.out.println(integer);
			}
		}
			
		for (Integer number : numbers) {
				System.out.println(number);

			}
			
			System.out.println(numbers.get(0));
	
	
	
	
	}











}