package patikaHipotenus;

import java.util.Scanner;

public class PatikaUcgenAlan {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner ucgen = new Scanner(System.in);
		
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz:");
		int a = ucgen.nextInt();
		int b = ucgen.nextInt();
		int c = ucgen.nextInt();
		double u = (a + b + c) / 2;
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		
		boolean kosul = alan <= 0;
		String uygunMu = kosul ? "Gecersiz degerler.": "Ucgenin cevresi: " + 2 * u + "\nUcgenin alani: " + alan;
		System.out.println(uygunMu);
	}
}
