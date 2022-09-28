import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row;
		int col;
		
		System.out.println("Mayin Tarlasi oyununa hosgeldiniz!");
		System.out.println("Lutfen oyun alaninizin boyutlarini giriniz.");
		System.out.print("Satir sayisi: ");
		row = scanner.nextInt();
		System.out.print("Sutun sayisi: ");
		col = scanner.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		mine.run();
		scanner.close();
	}
}
