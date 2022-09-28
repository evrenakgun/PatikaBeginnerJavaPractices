package minMax;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		// @author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 0;
		
		System.out.print("Kac tane sayi gireceksiniz: ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Lutfen " + i + ". sayiyi giriniz: ");
			int sayi = input.nextInt();
			if (i == 1) {
				max = sayi;
				min = sayi;
			}
			else {
				if (sayi > max) {
					max = sayi;
				}
				else if (sayi < min) {
					min = sayi;
				}
			}
		}
		System.out.println("En buyuk sayi: " + max);
		System.out.println("En kucuk sayi: " + min);
	}
}
