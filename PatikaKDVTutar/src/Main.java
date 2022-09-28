import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// @author: Evren Akgün

		Scanner kdv = new Scanner(System.in);
		double tutar;
		double kdvOran1 = 0.18; // 1000 TL'den düşük tutar için KDV oranı
		double kdvOran2 = 0.08; // 1000 TL'den yüksek tutar için KDV oranı

		System.out.print("Lutfen para miktarini giriniz: ");
		tutar = kdv.nextDouble();
		double kdvTutar1 = tutar * kdvOran1;
		double kdvTutar2 = tutar * kdvOran2;

		if (tutar > 1000) {
			System.out.println(
					"KDV'li fiyat: " + (kdvTutar2 + tutar) + " TL'dir. KDV tutari ise " + kdvTutar2 + " TL'dir.");
		}

		else if (tutar > 0 && tutar <= 1000) {
			System.out.println(
					"KDV'li fiyat: " + (kdvTutar1 + tutar) + " TL'dir. KDV tutari ise " + kdvTutar1 + " TL'dir.");
		}

		else {
			System.out.println("Hatali islem, lutfen tekrar deneyin.");
		}

	}

}
