package asalSayi;

import java.util.Iterator;

public class AsalSayi {
	public static void main(String[] args) {
		// @author: Evren Akgün
		int sayi = 100;
		boolean asalMi = false;
		
		for (int i = 2; i < sayi; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					asalMi = false;
					break;
				}
				else {
					asalMi = true;
				}
			}
			if (asalMi == true || i == 2) {
				System.out.print(i + " ");
			}
			
		}
	}
}
