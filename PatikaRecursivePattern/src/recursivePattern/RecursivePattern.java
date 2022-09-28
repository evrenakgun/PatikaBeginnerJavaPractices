package recursivePattern;

import java.util.Scanner;

public class RecursivePattern {
	// @author: Evren Akgün
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sinir degerini girin: ");
		int n = scanner.nextInt();
		
		if (n == 0) {
			System.out.println("0");
		}
		else {
			positive(negative(n), n);
		}	
	}
	
	static int positive(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			System.out.print(a + " ");
			return positive(a + 5, b);
		}
	}
	
	static int negative(int a) {
		if (a <= 0) {
			return a;
		}
		else {
			System.out.print(a + " ");
			return negative(a - 5);
		}
	}
}
