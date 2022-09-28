package taksimetre;

import java.util.Scanner;

public class Taksimetre {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner taksi = new Scanner(System.in);
		double taksiAcilis = 10;
		
		System.out.print("Gitmek istediginiz mesafeyi giriniz(km): ");
		double mesafe = taksi.nextDouble();
		
		double taksiUcreti = taksiAcilis + (mesafe * 2.20);
		
		boolean kosul = taksiUcreti <= 20;
		
		String uygunMu = kosul ? "Ucret: 20 TL": "Ucret: " + taksiUcreti + " TL";
		System.out.println(uygunMu);
	}
}
