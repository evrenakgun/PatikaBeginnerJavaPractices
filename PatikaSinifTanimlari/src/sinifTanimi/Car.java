package sinifTanimi;

class Car {
	// Nitelikler
	String type;
	String model;
	String color;
	int speed;
	int speedLimit;
	
	// Davranışlar
	
	Car(String model, int speed, String color){
		this.model = model;
		this.speed = speed;
		this.color = color;
		this.type = "Sedan";
		this.speedLimit = 180;
	}
	
	Car(){
		System.out.println("Bos kurucu metodu olustu");
	}
	
	void increaseSpeed(int increment) {
		if ((this.speed + increment) < this.speedLimit) {
			this.speed += increment;
		}
	}
	
	void decreasedSpeed(int decrease) {
		if (this.speed > 0) {
			this.speed -= decrease;
		}
	}
	
	void printSpeed() {
		System.out.println(this.model + "\nHiziniz: " + this.speed);
	}
	
	void printInfo() {
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Type: " + this.type);
		System.out.println("Speed: " + this.speed);
	}
}
