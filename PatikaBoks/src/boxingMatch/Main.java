package boxingMatch;

public class Main {
	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 100, 90, 20);
		Fighter alex = new Fighter("Alex", 10, 100, 100, 50);
		Ring r = new Ring(marc, alex, 85, 100);
		
		r.run();
	}
}
