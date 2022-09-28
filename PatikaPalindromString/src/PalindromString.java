import java.util.Scanner;

public class PalindromString {
	public static void isPalindrom(String word) {
		String reverse = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		
		if (word.equals(reverse)) {
			System.out.println("Girdiginiz kelime palindrom bir kelimedir.");
		}
		else {
			System.out.println("Girdiginiz kelime palindrom bir kelime degildir.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Palindrom olup olmadigini ogrenmek icin lutfen bir kelime giriniz: ");
		String word = scanner.nextLine();
		isPalindrom(word);
		scanner.close();
	}
}
