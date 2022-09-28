import java.util.Scanner;

public class ArrayTranspose {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin satir sayisini giriniz: ");
		int row = scanner.nextInt();
		System.out.print("Dizinin sutun sayisini giriniz: ");
		int column = scanner.nextInt();

		int[][] list = new int[row][column];
		int[][] listTranspose = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("Lutfen " + i + ". satirin " + j + ". sutun elemanini giriniz: ");
				list[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				listTranspose[j][i] = list[i][j];
			}
		}
		System.out.println("===========================================");
		System.out.println("Girilen dizi:");
		for (int[] row1 : list) {
			for (int col1 : row1) {
				System.out.print(" " + col1 + " ");
			}
			System.out.println();
		}
		
		System.out.println("Girilen dizinin transpozesi:");
		for (int[] row2 : listTranspose) {
			for (int col2 : row2) {
				System.out.print(" " + col2 + " ");
			}
			System.out.println();
		}
		
	}
}
