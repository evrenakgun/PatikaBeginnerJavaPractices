package NotOrt;

import java.util.Scanner;

public class notOrt {
	public static void main(String[] args) {
		/*
		 * @author: Evren Akgün
		 
		 Not Ortalaması Hesaplayan Program
		 Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
		 
		 Ödev
		 Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
		 Not : If ve Else kullanılmayacak...
		 */
		int mat1, mat2; //matematik
		int fiz1, fiz2; //fizik
		int kim1, kim2; //kimya
		int tur1, tur2; //türkçe
		int tar1, tar2; //tarih
		int mus1, mus2; //müzik
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Matematik Notu: ");
		mat1 = scanner.nextInt();
		System.out.print("2. Matematik Notu: ");
		mat2 = scanner.nextInt();
		
		System.out.print("1. Fizik Notu: ");
		fiz1 = scanner.nextInt();
		System.out.print("2. Fizik Notu: ");
		fiz2 = scanner.nextInt();
		
		System.out.print("1. Kimya Notu: ");
		kim1 = scanner.nextInt();
		System.out.print("2. Kimya Notu: ");
		kim2 = scanner.nextInt();
		
		System.out.print("1. Turkce Notu: ");
		tur1 = scanner.nextInt();
		System.out.print("2. Turkce Notu: ");
		tur2 = scanner.nextInt();
		
		System.out.print("1. Tarih Notu: ");
		tar1 = scanner.nextInt();
		System.out.print("2. Tarih Notu: ");
		tar2 = scanner.nextInt();
		
		System.out.print("1. Muzik Notu: ");
		mus1 = scanner.nextInt();
		System.out.print("2. Muzik Notu: ");
		mus2 = scanner.nextInt();
		
		//Notlarda ilk sınavların %40'ını, ikinci sınavların %60'ını aldık.
		int matOrt = (int) ((0.4 * mat1) + (0.6 * mat2));
		int fizOrt = (int) ((0.4 * fiz1) + (0.6 * fiz2));
		int kimOrt = (int) ((0.4 * kim1) + (0.6 * kim2));
		int turOrt = (int) ((0.4 * tur1) + (0.6 * tur2));
		int tarOrt = (int) ((0.4 * tar1) + (0.6 * tar2));
		int musOrt = (int) ((0.4 * mus1) + (0.6 * mus2));
		int toplamOrt = (matOrt + fizOrt + kimOrt + turOrt + tarOrt + musOrt) / 6;
		
		//Sınıfı geçme koşulunu 60 not ortalamasına bağladık.
		boolean kosul = toplamOrt >= 60;
		String basariliMi = kosul ? "Sinifi gectiniz, tebrikler." : "Sinifi gecemediniz.";
		
		System.out.println("Not Ortalamaniz: " + toplamOrt + ". " + basariliMi);
	}

}
