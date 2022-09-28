package pratikCiftSayiToplam;

import java.util.Scanner;

public class PratikCiftSayiToplam {
	public static void main(String[] args) {
		// @author: Evren Akgün

		Scanner input = new Scanner(System.in);

		double toplamUce = 0;
		double toplamUceEksi = 0;
		double toplamDorde = 0;
		double toplamDordeEksi = 0;
		double ortalamaUce = 0;
		double ortalamaUceEksi = 0;
		double ortalamaDorde = 0;
		double ortalamaDordeEksi = 0;
		int kacSayi3 = 0;
		int kacSayiEksi3 = 0;
		int kacSayi4 = 0;
		int kacSayiEksi4 = 0;

		System.out.print("Lutfen bir tam sayi giriniz: ");
		int sayi = input.nextInt();

		if (sayi >= 0) {
			for (int i = 0; i <= sayi; i++) {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
				}
			}
			System.out.println();

			for (int j = 1; j <= sayi; j++) {
				if (j % 3 == 0) {
					toplamUce += j;
					kacSayi3++;
					ortalamaUce = toplamUce / kacSayi3;
				}
			}
			System.out.println("3'e bolunebilen sayilarin ortalamasi: " + ortalamaUce);

			for (int k = 1; k <= sayi; k++) {
				if (k % 4 == 0) {
					toplamDorde += k;
					kacSayi4++;
					ortalamaDorde = toplamDorde / kacSayi4;
				}
			}
			System.out.println("4'e bolunebilen sayilarin ortalamasi: " + ortalamaDorde);
		}
		
		if (sayi < 0) {
			for (int x = 0; x >= sayi; x--) {
				if (x % 2 == 0) {
					System.out.print(x + ", ");
				}
			}
			System.out.println();
			
			for (int y = -1; y >= sayi; y--) {
				if (y % 3 == 0) {
					toplamUceEksi += y;
					kacSayiEksi3++;
					ortalamaUceEksi = toplamUceEksi / kacSayiEksi3;
				}
			}
			System.out.println("3'e bolunebilen sayilarin ortalamasi: " + ortalamaUceEksi);
			
			for (int z = -1; z >= sayi; z--) {
				if (z % 4 == 0) {
					toplamDordeEksi += z;
					kacSayiEksi4++;
					ortalamaDordeEksi = toplamDordeEksi / kacSayiEksi4;
				}
			}
			System.out.println("4'e bolunebilen sayilarin ortalamasi: " + ortalamaDordeEksi);
		}

	}
}
