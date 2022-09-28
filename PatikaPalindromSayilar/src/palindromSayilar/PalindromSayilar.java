package palindromSayilar;

import java.util.Scanner;

public class PalindromSayilar {
	// @author: Evren Akgün
	
	static boolean isPalindrom(int number) {
		int temp = number;
		int reverseNumber = 0;
		int lastNumber;
		
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
			
		}
		if (number == reverseNumber) {
			System.out.println(number + " palindrom sayidir.");
		}
		else {
			System.out.println(number + " palindrom sayi degildir. Sayinin tersten okunusu: " + reverseNumber);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Palindrom olup olmadigini ogrenmek icin bir sayi girin: ");
		int num = input.nextInt();
		isPalindrom(num);
	}
}
