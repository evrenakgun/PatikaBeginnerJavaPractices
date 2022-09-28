package sinifTanimi;

public class Main {
	public static void main(String[] args) {
		Car audi = new Car("Audi", 10, "Blue");
		audi.printInfo();
		
		
		Car bmw = new Car();
		bmw.model = "BMW";
		bmw.speed = 20;
		
		Car mercedes = new Car();
		mercedes.model = "Mercedes e200";
		mercedes.speed = 30;
		
	}
}
