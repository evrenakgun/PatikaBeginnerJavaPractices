import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	String[][] mineMap;
	String[][] gameMap;
	int row;
	int col;
	int mineNumber;
	boolean game = true;

	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public MineSweeper(int row, int col) {
		this.row = row;
		this.col = col;
		this.mineNumber = (row * col) / 4;
		this.mineMap = new String[row][col];
		this.gameMap = new String[row][col];
	}

	public void run() { // Oyunu çalıştıran metot
		int row;
		int col;

		gameArea();
		mineArea();
		printArea(mineMap);
		System.out.println("========================================");
		System.out.println("Oyun basladi!");
		System.out.println("========================================");
		while (game) {
			printArea(gameMap);
			System.out.print("Satir: ");
			row = scanner.nextInt();
			System.out.print("Sutun: ");
			col = scanner.nextInt();

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

			if (mineMap[row][col] != " * ") {
				checkMine(row, col);
				if (checkWin()) {
					System.out.println("=========================================");
					System.out.println("*** Tebrikler! Oyunu kazandiniz! ***");
					System.out.println("=========================================");
					break;
				}

			}

			else {
				game = false;
				System.out.println("*** Oyunu kaybettiniz! ***");
				System.out.println("===============================");
				System.out.println("Mayinlarin yeri: ");
				System.out.println("===============================");
				printArea(mineMap);
			}

		}
	}

	public boolean checkWin() { // Oyun alanında mayın olmayan bir indis kalıp kalmadığını kontrol ediyoruz.
		for (int i = 0; i < this.row; i++) {
			for (int j = 0; j < this.col; j++) {
				if (mineMap[i][j].equals(" - ")) {
					return false;
				}
			}
		}
		return true;
	}

	public void checkMine(int r, int c) { // Kullanıcının girdiği indis etrafındaki mayın sayısının kontrolü
		int count = 0;
		for (int i = (r - 1); i <= (r + 1); i++) {
			for (int j = (c - 1); j <= (c + 1); j++) {
				if ((i < 0) || (j < 0) || (i >= this.row) || (j >= this.col)) {
					continue;
				}

				if (mineMap[i][j].equals(" * ")) {
					count++;
				}
			}
		}

		gameMap[r][c] = String.valueOf(" " + count + " ");
		mineMap[r][c] = String.valueOf(" " + count + " ");
	}

	public void gameArea() { // Oyun alanının ilk hali
		for (int i = 0; i < gameMap.length; i++) {
			for (int j = 0; j < gameMap[i].length; j++) {
				gameMap[i][j] = " - ";
				gameMap[i][j] = " - ";
			}
		}
	}

	public void mineArea() { // Belirlenen sınırlar çerçevesinde rastgele mayın yerleşimi
		int mineRow;
		int mineCol;
		int count = 0;

		while (count < mineNumber) {
			mineRow = random.nextInt(row);
			mineCol = random.nextInt(col);

			if (mineMap[mineRow][mineCol] != " * ") {
				mineMap[mineRow][mineCol] = " * ";
				count++;
			}
		}

		for (int i = 0; i < mineMap.length; i++) {
			for (int j = 0; j < mineMap[i].length; j++) {
				if (mineMap[i][j] != " * ") {
					mineMap[i][j] = " - ";
				}
			}
		}
	}

	public void printArea(String[][] arr) { // Dizileri ekrana bastıran metot
		for (String[] row : arr) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
