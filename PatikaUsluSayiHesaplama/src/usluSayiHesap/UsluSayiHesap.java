package usluSayiHesap;

import java.util.Scanner;

public class UsluSayiHesap {
	public static void main(String[] args) {
		// @author: Evren Akgün

		Scanner input = new Scanner(System.in);
		int a, b;

		System.out.print("Taban sayiyi giriniz: ");
		a = input.nextInt();
		System.out.print("Ussunu giriniz: ");
		b = input.nextInt();
		int toplamPozitif = 1;
		double toplamNegatif = 1;

		if (b >= 0) {

			for (int i = 1; i <= b; i++) {
				toplamPozitif *= a;
			}
			System.out.println("Sonuc: " + toplamPozitif);
		}

		else if (b < 0) {
			for (int i = -1; i >= b; i--) {
				toplamNegatif *= a;
			}
			System.out.println("Sonuc: " + (1 / toplamNegatif));
		}
		
		System.out.println(Math.pow(a, b));

	}
}
