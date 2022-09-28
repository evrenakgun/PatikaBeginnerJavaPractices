import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz: ");
		int n = scanner.nextInt();
		int[] list = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Lutfen " + i + ". elemani giriniz: ");
			list[i] = scanner.nextInt();
		}
		
		Arrays.sort(list);
		System.out.println("Siralama: " + Arrays.toString(list));
	}
}
