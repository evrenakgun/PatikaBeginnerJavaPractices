package faktoriyelHesaplama;

import java.util.Scanner;

public class FaktoriyelHesaplama {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		int sayi1;
		int sayi2;
		int sayi1Fak = 1;
		int sayi2Fak = 1;
		int cikarmaFak = 1;
		
		System.out.print("Lutfen kombinasyonun ilk sayisini giriniz: ");
		sayi1 = input.nextInt();
		System.out.print("Lutfen kombinasyonun ikinci sayisini giriniz: ");
		sayi2 = input.nextInt();
		
		for (int i = 1; i <= sayi1; i++) {
			sayi1Fak *= i;
		}
		
		for (int j = 1; j <= sayi2; j++) {
			sayi2Fak *= j;
		}
		
		for (int k = 1; k <= (sayi1 - sayi2); k++) {
			cikarmaFak *= k;
		}
		
		System.out.println(sayi1 + "' in " + sayi2 + "' li kombinasyonu: " + sayi1Fak / (sayi2Fak * cikarmaFak));
	}
}
