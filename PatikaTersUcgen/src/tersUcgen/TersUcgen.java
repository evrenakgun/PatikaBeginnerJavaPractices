package tersUcgen;

import java.util.Scanner;

public class TersUcgen {
	public static void main(String[] args) {
		// @author: Evren Akgün
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak sayisini giriniz: ");
		int n = input.nextInt();
		
		for (int a = 0; a <= n; a++) {
			for (int c = 0; c < a; c++) {
				System.out.print(" ");
			}
			
			for (int b = 0; b < (2 * n) - (2 * a + 1); b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
