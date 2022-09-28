package yildizdanElmas;

import java.util.Scanner;

public class YildizdanElmas {
	public static void main(String[] args) {
		// @author: Evren Akgün

		Scanner input = new Scanner(System.in);

		System.out.print("Pozitif bir tam sayi giriniz: ");
		int sayi = input.nextInt();

		for (int i = 1; i <= sayi; i++) {
			for (int j = sayi; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int a = 1; a <= sayi; a++) {
			for (int c = 0; c < a; c++) {
				System.out.print(" ");
			}
			
			for (int b = 0; b < (2 * sayi) - (2 * a + 1); b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
