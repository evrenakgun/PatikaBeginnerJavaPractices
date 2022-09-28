package kucuktenBuyugeSiralama;

import java.util.Scanner;

public class KucuktenBuyugeSiralama {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		
		int sayi1, sayi2, sayi3;
		
		System.out.println("Girilen 3 sayiyi kucukten buyuge siralayan programa hosgeldiniz.");
		System.out.print("1. sayi: ");
		sayi1 = input.nextInt();
		System.out.print("2. sayi: ");
		sayi2 = input.nextInt();
		System.out.print("3. sayi: ");
		sayi3 = input.nextInt();
		
		if (sayi1 < sayi2 && sayi1 < sayi3) {
			if (sayi2 < sayi3) {
				System.out.println(sayi1 + " < " + sayi2 + " < " + sayi3);
			}
			else if (sayi2 == sayi3) {
				System.out.println(sayi1 + " < " + sayi2 + " = " + sayi3);
			}
			else {
				System.out.println(sayi1 + " < " + sayi3 + " < " + sayi2);
			}
		}
		
		else if (sayi2 < sayi1 && sayi2 < sayi3) {
			if (sayi1 < sayi3) {
				System.out.println(sayi2 + " < " + sayi1 + " < " + sayi3);
			}
			else if (sayi1 == sayi3) {
				System.out.println(sayi2 + " < " + sayi1 + " = " + sayi3);
			}
			else {
				System.out.println(sayi2 + " < " + sayi3 + " < " + sayi1);
			}
		}
		
		else if (sayi3 < sayi2 && sayi3 < sayi1) {
			if (sayi2 < sayi1) {
				System.out.println(sayi3 + " < " + sayi2 + " < " + sayi1);
			}
			else if (sayi2 == sayi1) {
				System.out.println(sayi3 + " < " + sayi2 + " = " + sayi1);
			}
			else {
				System.out.println(sayi3 + " < " + sayi1 + " < " + sayi2);
			}
		}
		
		else if (sayi1 == sayi2 && sayi1 < sayi3) {
			System.out.println(sayi1 + " = " + sayi2 + " < " + sayi3);
		}
		
		else if (sayi2 == sayi3 && sayi3 < sayi1) {
			System.out.println(sayi3 + " = " + sayi2 + " < " + sayi1);
		}
		
		else if (sayi1 == sayi3 && sayi1 < sayi2) {
			System.out.println(sayi1 + " = " + sayi3 + " < " + sayi2);
		}
		
		else if (sayi1 == sayi2 && sayi2 == sayi3) {
			System.out.println(sayi1 + " = " + sayi2 + " = " + sayi3);
		}
	}
}
