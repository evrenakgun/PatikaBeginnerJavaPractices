package cinZodyagiHesaplama;

import java.util.Scanner;

public class CinZodyagiHesaplama {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		int dogumYili;
		
		System.out.print("Lutfen dogum yilinizi giriniz: ");
		dogumYili = input.nextInt();
		int kalan = dogumYili % 12;
		
		switch (kalan) {
		case 0:
			System.out.println("Cin Zodyagi Burcunuz: Maymun");
			break;
		case 1:
			System.out.println("Cin Zodyagi Burcunuz: Horoz");
			break;
		case 2:
			System.out.println("Cin Zodyagi Burcunuz: Kopek");
			break;
		case 3:
			System.out.println("Cin Zodyagi Burcunuz: Domuz");
			break;
		case 4:
			System.out.println("Cin Zodyagi Burcunuz: Fare");
			break;
		case 5:
			System.out.println("Cin Zodyagi Burcunuz: Okuz");
			break;
		case 6:
			System.out.println("Cin Zodyagi Burcunuz: Kaplan");
			break;
		case 7:
			System.out.println("Cin Zodyagi Burcunuz: Tavsan");
			break;
		case 8:
			System.out.println("Cin Zodyagi Burcunuz: Ejderha");
			break;
		case 9:
			System.out.println("Cin Zodyagi Burcunuz: Yilan");
			break;
		case 10:
			System.out.println("Cin Zodyagi Burcunuz: At");
			break;
		case 11:
			System.out.println("Cin Zodyagi Burcunuz: Koyun");
			break;
		}
	}
}
