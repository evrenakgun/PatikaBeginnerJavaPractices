package boxingMatch;

public class Ring {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		
	}
	
	public void run() {
		if (checkWeight()) {
			while (this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("***** YENI ROUND *****");
				if (starter() == 1) {
					this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " health " + this.f2.health);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " health " + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                }else {
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " health " + this.f1.health);
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " health " + this.f2.health);
                    if (isWin()) {
                        break;
                    }
				printScore();
			}
			}
		} 
			else {
			System.out.println("Sporcularin agirliklari uyusmuyor.");
		}
	}
	
	public boolean checkWeight() {
		return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	public boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println("Maci kazanan: " + this.f2.name);
			return true;
		}
		else if (this.f2.health == 0) {
			System.out.println("Maci kazanan: " + this.f1.name);
			return true;
		}
		return false;
	}
	
	public int starter() {
		double firstOne = Math.random() * 100;
		if (firstOne < 50) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public void printScore() {
		System.out.println("------------------------------");
		System.out.println(f1.name + " Kalan can \t:" + this.f1.health);
		System.out.println(f2.name + " Kalan can \t:" + this.f2.health);
	}
	
}
