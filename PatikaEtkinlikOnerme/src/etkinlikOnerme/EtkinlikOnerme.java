package etkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sicaklik giriniz: ");
		double heat = input.nextDouble();
		
		boolean kosul1 = heat < 5;
		boolean kosul2 = heat >= 5 && heat < 15;
		boolean kosul3 = heat >= 15 && heat < 25;
		boolean kosul4 = heat >= 25;
		
		String etkinlik = kosul1 ? "Kayak yapabilirsiniz.": kosul2 ? "Sinemaya gidebilirsiniz.":
				kosul3 ? "Piknik yapabilirsiniz.": kosul4 ? "Yuzmeye gidebilirsiniz.": null;
		
		System.out.println(etkinlik);
	}
}
