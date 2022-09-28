package gelismisHesapMak;

import java.util.Scanner;

public class GelismisHesapMak {
	// @author: Evren Akgün

	static void toplama() {
		Scanner scanner = new Scanner(System.in);
		int number;
		int n;
		int i = 1;
		int result = 0;

		System.out.print("Kac tane sayi gireceksiniz: ");
		n = scanner.nextInt();

		while (i <= n) {
			System.out.print(i++ + ". sayiyi girin: ");
			number = scanner.nextInt();
			result += number;
			if (i > n) {
				break;
			}
		}
		System.out.println("Sonuc: " + result);
	}

	static void cikarma() {
		Scanner scanner = new Scanner(System.in);
		int number;
		int minus;
		int n;
		int i = 1;
		
		System.out.print("Eksilen elemani girin: ");
		number = scanner.nextInt();
		System.out.print("Kac eleman cikaracaksiniz: ");
		n = scanner.nextInt();

		while (i <= n) {
			System.out.print(i++ + ". sayiyi girin: ");
			minus = scanner.nextInt();
			number -= minus;
			if (i > n) {
				break;
			}
		}
		System.out.println("Sonuc: " + number);
	}

	static void carpma() {
		Scanner scanner = new Scanner(System.in);
		int number;
		int n;
		int i = 1;
		int result = 1;

		System.out.print("Kac tane sayi gireceksiniz: ");
		n = scanner.nextInt();

		while (i <= n) {
			System.out.print(i++ + ". sayiyi girin: ");
			number = scanner.nextInt();
			result *= number;
			if (i > n) {
				break;
			}
		}
		System.out.println("Sonuc: " + result);
	}

	static void bolme() {
		Scanner scanner = new Scanner(System.in);
		double number;
		double divide;
		int n;
		int i = 1;
		
		System.out.print("Bolmek istediginiz sayiyi girin: ");
		number = scanner.nextDouble();
		System.out.print("Kac sayiya boleceksiniz: ");
		n = scanner.nextInt();

		while (i <= n) {
			System.out.print(i++ + ". sayiyi girin: ");
			divide = scanner.nextDouble();
			number /= divide;
			if (i > n) {
				break;
			}
		}
		System.out.println("Sonuc: " + number);
	}

	static void usluSayi() {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;

		System.out.print("Taban degerini girin: ");
		a = scanner.nextInt();
		System.out.print("Kuvvetini degerini girin: ");
		b = scanner.nextInt();

		System.out.println("Sonuc: " + Math.pow(a, b));
	}

	static void fakt() {
		Scanner scanner = new Scanner(System.in);
		int n;
		int result = 1;

		System.out.print("Faktoriyelini bulmak istediginiz sayiyi girin: ");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("Sonuc: " + result);
	}

	static void mod() {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;

		System.out.print("Modunu almak istediginiz sayiyi girin: ");
		a = scanner.nextInt();
		System.out.println("Mod elemanini giriniz: ");
		b = scanner.nextInt();

		System.out.println("Sonuc: " + a % b);
	}

	static void dikdortgen() {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int cevre = 0;
		int alan = 0;

		System.out.print("Dikdortgenin ilk kenarinin uzunlugunu girin: ");
		a = scanner.nextInt();
		System.out.println("Dikdortgenin ikinci kenarinin uzunlugunu girin: ");
		b = scanner.nextInt();

		cevre = 2 * (a + b);
		alan = a * b;
		System.out.println("Cevre: " + cevre + "\nAlan: " + alan);
	}

	static void daire() {
		double pi = 3.14;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dairenin yaricapini giriniz: ");
		double r = scanner.nextDouble();

		double cevre = 2 * pi * r;
		double alan = pi * r * r;
		System.out.println("pi degeri: " + pi);
		System.out.println("Dairenin cevresi: " + cevre + "\nDairenin alani: " + alan);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int islem;
		String islemler = "1. Toplama Islemi \n"
						+ "2. Cikarma Islemi \n"
						+ "3. Carpma Islemi \n"
						+ "4. Bolme Islemi \n"
						+ "5. Uslu Sayi Hesaplama \n"
						+ "6. Faktoriyel Hesaplama \n"
						+ "7. Mod Alma \n"
						+ "8. Dikdortgen Cevresi ve Alan Hesabi \n"
						+ "9. Daire Cevresi ve Alan Hesabi \n"
						+ "0. Cikis";
		do {
			System.out.println();
			System.out.println("*************************************************");
			System.out.println(islemler);
			System.out.println("*************************************************");
			System.out.print("Lutfen bir islem seciniz: ");
			islem = scanner.nextInt();

			switch (islem) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				carpma();
				break;
			case 4:
				bolme();
				break;
			case 5:
				usluSayi();
				break;
			case 6:
				fakt();
				break;
			case 7:
				mod();
				break;
			case 8:
				dikdortgen();
				break;
			case 9:
				daire();
				break;
			case 0:
				System.out.println("Programdan cikiliyor...");
				break;

			default:
				System.out.println("Lutfen gecerli bir deger giriniz.");
			}
		}while(islem != 0);

	}
}
