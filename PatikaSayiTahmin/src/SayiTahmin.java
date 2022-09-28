import java.util.Scanner;
import java.util.Arrays;

public class SayiTahmin {
	public static void main(String[] args) {
		int number = (int) (Math.random() * 100);

		Scanner scanner = new Scanner(System.in);

		int rights = 0;
		int[] guesses = new int[5];

		while (rights < 5) {
			System.out.print("Lutfen 0 - 100 arasinda bir tam sayi giriniz (0 ve 100 dahil): ");
			int guess = scanner.nextInt();
			
			if (guess < 0 || guess > 100) {
				System.out.println("Lutfen gecerli bir tam sayi giriniz.");
				continue;
			}
			
			if (guess == number) {
				System.out.println("Tebrikler, bildiniz. Aranilan sayi: " + number);
				break;
			}
			else {
				if (guess > number) {
					System.out.println("Henuz sayiyi bulamadiniz, biraz alcaklarda arayin :)");
				}
				else {
					System.out.println("Henuz sayiyi bulamadiniz, biraz yukseklerde arayin :)");
				}
				
				guesses[rights++] = guess;
				System.out.println("Kalan tahmin hakkiniz: " + (5 - rights));
			}
			
			if (rights == 5) {
				System.out.println("Ne yazik ki sayiyi bulamadiniz :(");
				System.out.println("Tahminleriniz: " + Arrays.toString(guesses));
				System.out.println("Aradiginiz sayi ise: " + number);
			}
		}
		
		scanner.close();
	}
}
