package tekSayiToplam;

import java.util.Scanner;

public class TekSayiToplam {
	public static void main(String[] args) {
		// @author: Evren Akgün

		Scanner input = new Scanner(System.in);
		int sayi;
		int toplamCift = 0;
		int toplamDordunKati = 0;
		
		do {
			System.out.print("Lutfen bir tam sayi giriniz: ");
			sayi = input.nextInt();
			
			if (sayi % 2 == 0) {
				toplamCift += sayi;
			}

			if (sayi % 4 == 0) {
				toplamDordunKati += sayi;
			}
			
		} while (sayi % 2 != 1);
		
		System.out.println("Cift sayilarin toplami: " + toplamCift);
		System.out.println("Dorde bolunebilen sayilarin toplami: " + toplamDordunKati);

	}
}
