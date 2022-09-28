package patikaEmployee;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Evren", 900, 50, 2010);
		Employee e2 = new Employee("Ahmet", 1500, 40, 1990);
		e1.run();
		e2.run();	
	}
}
