package vucutKitleIndeks;

import java.util.Scanner;

public class VucutKitleIndeks {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
		double boy = input.nextDouble();
		System.out.print("Lutfen kilonuzu giriniz: ");
		double kilo = input.nextDouble();
		double vki = kilo / (boy * boy);
		
		System.out.println("Vucut Kitle Indeksiniz: " + vki);
	}
}
