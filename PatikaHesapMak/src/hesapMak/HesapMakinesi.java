package hesapMak;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		System.out.println("Basit hesap makinesi programina hosgeldiniz.");
		
		System.out.print("Ilk sayiyi girin: ");
		int a = input.nextInt();
		System.out.print("Ikinci sayiyi girin: ");
		int b = input.nextInt();
		
		System.out.println("********************************************");
		String islemler = "1. Toplama \n"
						+ "2. Cikarma \n"
						+ "3. Carpma \n"
						+ "4. Bolme";
		System.out.println(islemler);
		System.out.println("********************************************");
		
		System.out.print("Lutfen 1-4 arasinda bir islem seciniz: ");
		int islem = input.nextInt();
		
		switch (islem) {
			case 1:
				System.out.println("Toplam: " + (a + b));
			break;
			
			case 2:
				System.out.println("Cikarma: " + (a - b));
			break;
			
			case 3:
				System.out.println("Carpma: " + (a * b));
			break;
			
			case 4:
				System.out.println("Bolme: " + (a / b));
			break;

			default:
				System.out.println("Hatali islem");
			break;
		}
	}
}
