package kullaniciGiris;

import java.util.Scanner;

public class KullaniciGirisi {
	public static void main(String[] args) {
		// @author: Evren Akgün

		String sys_username = "Evren";
		String sys_password = "12345";

		Scanner input = new Scanner(System.in);
		System.out.println("Hosgeldiniz, lutfen kullanici adi ve sifrenizi giriniz.");

		while (true) {
			System.out.print("Kullanici adi: ");
			String username = input.nextLine();
			System.out.print("Sifre: ");
			String password = input.nextLine();

			if (username.equals(sys_username) && password.equals(sys_password)) {
				System.out.println("Hosgeldin " + username);
				break;
			}

			else if (!username.equals(sys_username) && password.equals(sys_password)) {
				System.out.println("Hatali kullanici adi");
			}

			else if (username.equals(sys_username) && !password.equals(sys_password)) {
				if (username.equals(sys_username) && !password.equals(sys_password)) {
					System.out.println("Hatali sifre. Sifrenizi sifirlamak isterseniz 1, istemezseniz 2'yi tuslayin.");
					int islem = input.nextInt();
					input.nextLine();

					switch (islem) {
					case 1:
						System.out.print("Yeni sifrenizi giriniz: ");
						String new_password = input.nextLine();
						
						while (new_password.equals(password) || new_password.equals(sys_password)){
							System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz: ");
							new_password = input.nextLine();
						}
						
						sys_password = new_password;
						System.out.println("Sifre olusturuldu.");
						continue;

					case 2:
						System.out.println("Sistemden cikiliyor...");
					}
					break;
				}
			}

			else {
				System.out.println("Hatali kullanici adi ve sifre");
			}
			
		}
	}
}
