import java.util.Arrays;

public class ArrayCount {
	public static void main(String[] args) {
		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int count = 0;
		Arrays.sort(list);

		for (int i = 0; i < list.length; i++) {
			count = 0;
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					count++;
				}
			}

			if (i == 0 && list[i + 1] == list[i]) {
				System.out.println(String.format("%d tane %d var.", count, list[i]));
			}

			if (i == 0 && list[i + 1] != list[i]) {
				System.out.println(String.format("%d tane %d var.", count, list[i]));
			}

			if (i != 0 && list[i - 1] != list[i]) {
				System.out.println(String.format("%d tane %d var.", count, list[i]));
			}
		}

	}
}
