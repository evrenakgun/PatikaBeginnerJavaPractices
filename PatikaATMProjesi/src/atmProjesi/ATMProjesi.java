package atmProjesi;

import java.util.Scanner;

public class ATMProjesi {
	public static void main(String[] args) {
		// @author: Evren Akgün
		/*
		 * Switch-case, if-else, do-while döngü çeşitleri kullanılarak bir ATM projesi yapıldı.
		 * Projedeki kullanıcı adı "evren", şifre ise "12345" tir.
		 */

		Scanner input = new Scanner(System.in);
		String sys_user = "evren";
		String sys_pass = "12345";
		int passRight = 3;
		int balance = 1000;
		int tutarCek;
		int tutarYatir;
		String islem;

		System.out.println("**********************************************************");
		System.out.println("Merhaba, Akgun Bankasi'na hosgeldiniz.");
		System.out.println("***********************************************");

		while (passRight > 0) {
			System.out.print("Kullanici Adi: ");
			String username = input.nextLine();
			System.out.print("Sifre: ");
			String password = input.nextLine();

			if (username.equals(sys_user) && password.equals(sys_pass)) {
				System.out.println("**********************************************************");
				System.out.println("Hosgeldiniz " + username + "!");

				do {
					System.out.println("Lutfen yapmak istediginiz islemi seciniz:");
					System.out.println("**********************************************************");
					String islemler = "1. Para cekme \n" + "2. Para yatirma \n" + "3. Bakiye sorgula \n"
							+ "'q' cikis yap.";
					System.out.println(islemler);
					System.out.println("**********************************************************");
					islem = input.nextLine();

					switch (islem) {
					case "1":
						System.out.println("Bakiyeniz: " + balance + " TL");
						System.out.print("Lutfen cekmek istediginiz tutari giriniz: ");
						tutarCek = input.nextInt();
						input.nextLine();
						if (tutarCek < balance) {
							balance -= tutarCek;
							System.out.println("Yeni bakiyeniz: " + balance + " TL");
						} else {
							System.out.println("Bakiyeniz yetersiz.");
						}
						break;
					case "2":
						System.out.print("Lutfen yatirmak istediginiz tutari giriniz: ");
						tutarYatir = input.nextInt();
						input.nextLine();
						balance += tutarYatir;
						System.out.println("Yeni bakiyeniz: " + balance + " TL");
						break;
					case "3":
						System.out.println("Bakiyeniz: " + balance + " TL");
						break;
					case "q":
						System.out.println("Hoscakalin " + username + "!");
						break;
					default:
						System.out.println("Lutfen gecerli bir deger girin.");
						break;
					}

				} while (!islem.equals("q"));
				break;
			}

			else {
				passRight--;
				System.out.println("Hatali kullanici adi veya sifre.");
				if (passRight == 0) {
					System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime gecin.");
				}

				else {
					System.out.println("Kalan giris hakki: " + passRight);
				}
			}

		}
	}
}
