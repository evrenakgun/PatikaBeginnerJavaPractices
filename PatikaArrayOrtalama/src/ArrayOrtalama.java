public class ArrayOrtalama {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		double sum = 0;
		
		for (int i : numbers) {
			sum += (1.0 / i);
		}
		System.out.println(numbers.length / sum);
	}
}
