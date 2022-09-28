package daireAlanCevre;

import java.util.Scanner;

public class DaireAlanCevre {
	public static void main(String[] args) {
		//@author: Evren Akgün
		
		double pi = 3.14;
		Scanner yaricap = new Scanner(System.in);
		
		System.out.print("Dairenin yaricapini giriniz: ");
		double r = yaricap.nextDouble();
		System.out.print("Dairenin merkez aci olcusunu giriniz: ");
		double a = yaricap.nextDouble();
		
		double cevre = 2 * pi * r;
		double alan = pi * r * r;
		double dilim = (alan * a) / 360;
		
		System.out.println("Dairenin cevresi: " + cevre + "\nDairenin alani: " + alan + "\nDaire diliminin alani: " + dilim);
	}
}
