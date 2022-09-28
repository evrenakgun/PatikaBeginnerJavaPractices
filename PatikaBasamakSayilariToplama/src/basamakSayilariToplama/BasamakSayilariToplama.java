package basamakSayilariToplama;

import java.util.Scanner;

public class BasamakSayilariToplama {
	public static void main(String[] args) {
		// @author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi girin: ");
		int sayi = input.nextInt();
		
		int basamakSayisi = 0;
		int basamakDegeri;
		int geciciSayi1 = sayi;
		int geciciSayi2 = sayi;
		int toplam = 0;
		int toplamBasamak = 0;
		
		while (geciciSayi1 > 0) {
			geciciSayi1 /= 10;
			basamakSayisi++;
		}
		
		do {
			basamakDegeri = geciciSayi2 % 10;
			geciciSayi2 /= 10;
			
			toplam += Math.pow(basamakDegeri, basamakSayisi);
			toplamBasamak += basamakDegeri;
		} while (geciciSayi2 > 0);
		
		System.out.println("Basamak sayilarinin toplami: " + toplamBasamak);
		
		if (sayi == toplam) {
			System.out.println("Armstrong sayisidir.");
		}
		
		else {
			System.out.println("Armstrong sayisi degildir.");
		}
		
	}
}
