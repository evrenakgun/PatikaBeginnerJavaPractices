package ebobEkok;

import java.util.Scanner;

public class EbobEkok {
	public static void main(String[] args) {
		// @author: Evren Akgün

		Scanner input = new Scanner(System.in);
		int sayi1;
		int sayi2;
		int a = 1;
		int ebob = 1;
		int ekok;

		System.out.println("Ebob-Ekok bulma programina hosgeldiniz.");
		System.out.println("*******************************************");
		System.out.print("Lutfen ilk sayiyi giriniz: ");
		sayi1 = input.nextInt();
		System.out.print("Lutfen ikinci sayiyi giriniz: ");
		sayi2 = input.nextInt();

		while (a <= sayi1 && a <= sayi2) {
			a++;
			if ((sayi1 % a == 0) && (sayi2 % a == 0)) {
				ebob = a;
			}
		}
		ekok = (sayi1 * sayi2) / ebob;
		System.out.println("Ekok: " + ekok + "\nEbob: " + ebob);

	}
}
