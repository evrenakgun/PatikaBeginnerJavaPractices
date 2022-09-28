package patikaHipotenus;

import java.util.Scanner;

public class PatikaHipotenus {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner hipo = new Scanner(System.in);
		
		System.out.print("Ilk dik kenar uzunlugu: ");
		int a = hipo.nextInt();
		System.out.print("Ikinci dik kenar uzunlugu: ");
		int b = hipo.nextInt();
		
		double c = Math.sqrt((a * a) + (b * b));
		System.out.println("Kenar uzunluklari girilen ucgenin hipotenusu: " + c);
		
	}
}
