package manavHesap;

import java.util.Scanner;

public class ManavHesap {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Armut kac kilo: ");
		double armutKilo = input.nextDouble();
		
		System.out.print("Elma kac kilo: ");
		double elmaKilo = input.nextDouble();
		
		System.out.print("Domates kac kilo: ");
		double domatesKilo = input.nextDouble();
		
		System.out.print("Muz kac kilo: ");
		double muzKilo = input.nextDouble();
		
		System.out.print("Patlican kac kilo: ");
		double patlicanKilo = input.nextDouble();
		
		double toplamArmut = armutKilo * armut;
		double toplamElma = elmaKilo * elma;
		double toplamDomates = domatesKilo * domates;
		double toplamMuz = muzKilo * muz;
		double toplamPatlican = patlicanKilo * patlican;
		double toplam = toplamArmut + toplamDomates + toplamElma + toplamMuz + toplamPatlican;
		
		System.out.println("Toplam armut fiyati: " + toplamArmut + " TL");
		System.out.println("Toplam elma fiyati: " + toplamElma + " TL");
		System.out.println("Toplam domates fiyati: " + toplamDomates + " TL");
		System.out.println("Toplam muz fiyati: " + toplamMuz + " TL");
		System.out.println("Toplam patlican fiyati: " + toplamPatlican + " TL");
		System.out.println("TOPLAM: " + toplam + " TL");
	}
}
