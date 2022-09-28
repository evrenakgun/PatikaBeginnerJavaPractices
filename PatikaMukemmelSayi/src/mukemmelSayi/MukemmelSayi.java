package mukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
	public static void main(String[] args) {
		// @author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		
		System.out.print("Lutfen pozitif bir tam sayi giriniz: ");
		sayi = input.nextInt();
		
		if (sayi > 0) {
			for (int i = 1; i < sayi; i++) {
				if (sayi % i == 0) {
					toplam += i;
				}
			}
			if (sayi == toplam) {
				System.out.println(sayi + " mukemmel sayidir.");
			}
			else {
				System.out.println(sayi + " mukemmel sayi degildir.");
			}
		}
		else {
			System.out.println("Gecersiz deger.");
		}
		
	}
}
