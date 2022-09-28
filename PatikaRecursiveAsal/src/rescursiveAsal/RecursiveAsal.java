package rescursiveAsal;

import java.util.Scanner;

public class RecursiveAsal {
	// @author: Evren Akgün
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int number = scanner.nextInt();
		prime(number, 2);
	}
	
	static void prime(int number, int i) {
		if (i == number) {
			System.out.println(number + " asaldir.");
			return;
		}
		
		if (number % i == 0) {
			System.out.println(number + " asal degildir.");
			return;
		}
		prime(number, i + 1);
	}
}
