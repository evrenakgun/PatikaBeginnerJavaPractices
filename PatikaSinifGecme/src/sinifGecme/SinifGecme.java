package sinifGecme;

import java.util.Scanner;

public class SinifGecme {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		int mat, fizik, turkce, kimya, muzik;
		double toplam = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();
		
		System.out.print("Turkce notunuz: ");
		turkce = input.nextInt();
		
		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();
		
		System.out.print("Muzik notunuz: ");
		muzik = input.nextInt();
		
		if (mat >= 0 && mat <= 100) {
			toplam += mat;
		}
		
		if (fizik >= 0 && fizik <= 100) {
			toplam += fizik;
		}
		
		if (turkce >= 0 && turkce <= 100) {
			toplam += turkce;
		}
		
		if (kimya >= 0 && kimya <= 100) {
			toplam += kimya;
		}
		
		if (muzik >= 0 && muzik <= 100) {
			toplam += muzik;
		}
		
		double ortalama = (toplam) / 5;
		
		if (ortalama >= 55) {
			System.out.println("Notunuz: " + ortalama + ", tebrikler sinifi gectiniz.");
		}
		
		else {
			System.out.println("Notunuz: " + ortalama + ", sinifta kaldiniz.");
		}
	}
}
