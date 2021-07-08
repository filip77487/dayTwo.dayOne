package dayTwo.dayOne;

public class TestFactoriel {

	public static void main(String[] args) {
//		brokenFactoriel(5);
		factoriel(3);
		System.out.println(factoriel(0));
		

	}


// n! => 5! = 5 * 4! = ? 5! = 5 * 4 * 3 * 2 * 1

	/*
	 * method accept integer as input value
	 * factoriel for n is n * factoriel (n-1)
	 * if n in input argument factoriel from 1 is 1
	 */

	public static int factoriel(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return n * factoriel(n - 1);
		}
	}


	public static int brokenFactoriel(int n) {
		return brokenFactoriel(n);
	}


}
