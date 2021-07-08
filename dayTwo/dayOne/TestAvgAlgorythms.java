package dayTwo.dayOne;

import java.util.ArrayList;
import java.util.List;

public class TestAvgAlgorythms {
	

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(6);
		nums.add(8);
		nums.add(10);
		
		System.out.println(calculateAverageValue(nums));
		System.out.println(calculateAverageValue(nums));
		System.out.println(calculateAverageValue(nums));
		System.out.println(calculateAverageValue(nums));
	}
	
	
	/*
	 * 1. define input as list of integer values
	 * 2. set variable total sum to 0
	 * 3. loop over the list of integer values
	 * 4. add each integer value to the total sum
	 * 5. return results as totalSum devideafter by the number of elements in the list
 */

	public static Integer calculateAverageValue(List<Integer> numbers) {
		int totalSum = 0;
		for (Integer number : numbers) {
			totalSum += number;
		}
		
		return totalSum / numbers.size();
	
	
	
	
	}



}
