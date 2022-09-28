// Bu sınıfı dahil ederek bir çok kolaylık elde edebiliriz. 
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		int[] list2 = {5, 12, 35, 48, 90, 56};
		double[] list3 = {5.3, 12.2, 35.6, 48.56, 90.13, 56.03};
		int[] list4 = {67, 34, 63, 32, 56, 3, 18};
		int[] list5 = {1, 2, 3, 4, 5, 6, 7};
		int[] list6 = {1, 2, 3, 4, 5, 6, 7};
		
		// Tek virgüllü kullanıldığında listenin bütün elemanlarını girilen değer ile değiştirir.
		Arrays.fill(list2, 10);
		
		// Bu kullanımda ise ilk deger başlangıç indisini, ikinci değer bitiş indisini(dahil değil) temsil eder
		// 3. değer ise girilen indisler arasındaki elemanların yerine yazılması istenen değerdir.
		Arrays.fill(list, 3, 5, 12);
		
		// Aşağıdaki tostring komutuyla double, int, float farketmeksizin dizileri ekrana yazdırabiliriz.
		System.out.println(Arrays.toString(list3));
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		
		// Bu komut ile listeyi küçükten büyüğe doğru sıralayabiliriz.
		Arrays.sort(list4);
		System.out.println(Arrays.toString(list4));
		
		// Bu komut ile liste içindeki bir elemanın indisini bulabiliriz. Ama dizinin sıralı olması gerekmektedir.
		System.out.println(Arrays.binarySearch(list4, 32));
		
		// Mevcut diziyi kopyalayıp yeni bir dizi oluşturmak için kullanılır.
		// Sıralı veya sırasız olan diziden sıfırıncı indisten başlayarak kaç elemanlı olmasını seçtiysek o kadar
		// elemanını alarak yeni bir dizi oluşturur.
		int[] copyList = Arrays.copyOf(list4, 5);
		System.out.println(Arrays.toString(copyList));
		
		// Sıralı veya sırasız olan diziden seçilen indisler arasındaki elemanları alarak yeni bir dizi oluşturur.
		int[] copyList2 = Arrays.copyOfRange(list4, 1, 5);
		System.out.println(Arrays.toString(copyList2));
		
		// İki dizinin eşitliğini kontrol etmek için kullanılır.
		System.out.println(Arrays.equals(list5, list6)); // sonuç true olacaktır.
		
		// Yukarıdaki listelere baktığımızda list ile lis5 ve list6 birbirlerinin aynısı gözüküyor.
		// Ancak biz Arrays.fill(list, 3, 5, 12); bu komut ile list içindeki 3. ve 4. indisteki elemanları 12 ile
		// değiştirdiğimiz için eşitliği sorguladığımızda false çıkacaktır.
		System.out.println(Arrays.equals(list, list5));
	}
}
