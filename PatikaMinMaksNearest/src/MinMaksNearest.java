import java.util.Scanner;
import java.util.Arrays;

public class MinMaksNearest {
	public static void main(String[] args) {
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir tam sayi giriniz: ");
		number = scanner.nextInt();
		
		int[] copyList = Arrays.copyOf(list, list.length + 1);
		
		Arrays.fill(copyList, copyList.length -1, copyList.length, number);
		Arrays.sort(copyList);
		
		int nearestMin = copyList[0];
		int nearestMax = copyList[list.length];
		
		for (int i : copyList) {
			if (i < number) {
				if (i > nearestMin) {
					nearestMin = i;
				}
			}
			
			if (i > number) {
				if (i < nearestMax) {
					nearestMax = i;
				}
			}
		}
			
		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Girilen sayi: " + number);
		System.out.println("Girilen sayidan kucuk en yakin sayi: " + nearestMin);
		System.out.println("Girilen sayidan buyuk en yakin sayi: " + nearestMax);
		
		scanner.close();
	}
}
