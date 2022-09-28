package recursiveUsHesap;

import java.util.Scanner;

public class RecursivesUsHesabi {
	// @author: Evren Akgün
	
	static int power(int a, int b) {
		if (b == 0) {
			return 1;
		}
		else {
			return(a * power(a, b - 1));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayinin tabanini giriniz: ");
		int a = scanner.nextInt();
		System.out.print("Kuvvetini giriniz: ");
		int b = scanner.nextInt();
		
		System.out.println("Sonuc: " + power(a, b));
	}
}
