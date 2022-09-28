package patikaEmployee;

public class Employee {
	String name;
	double salary;
	double salaryNet;
	int workHours;
	int hireYear;
	double tax;
	double workOverTime; // mesai sistemi olduğu için bonus yerine kullanıldı method da aynı şekilde düzenlendi.
	double raiseSalary;
	
	public Employee (String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void run() {
		System.out.println("=============================================");
		System.out.println("=============================================");
		printInfo();
		System.out.println("---------------------------------------------");
		System.out.println("Taxes: \t\t\t" + "-" + tax() + " TL");
		System.out.println("Overtime Payment:\t" + "+" + workOverTime() + " TL");
		System.out.println("Salary Raise: \t\t" + "+" + raiseSalary() + " TL");
		System.out.println("Net Salary: \t\t" + salaryNet() + " TL");
	}
	
	public double salaryNet() {
		this.salaryNet = this.salary + this.workOverTime + this.raiseSalary - this.tax;
		return this.salaryNet;
	}
	
	public double tax() {
		if (this.salary > 1000) {
			this.tax = this.salary * 0.03;
			return this.tax;
		}
		else {
			return 0;
		}
	}
	
	public double workOverTime() {
		if (this.workHours > 40) {
			this.workOverTime = (this.workHours - 40) * 30.0;
			return this.workOverTime;
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		// Şu anki yıl 2021.
		if (2021 - this.hireYear < 10) {
			this.raiseSalary = this.salary * 0.05;
			return this.raiseSalary;
		}
		else if ((2021 - this.hireYear > 9) && (2021 - this.hireYear < 20)) {
			this.raiseSalary = this.salary * 0.1;
			return this.raiseSalary;
		}
		else {
			this.raiseSalary = this.salary * 0.15;
			return this.raiseSalary;
		}
	}
	
	public void printInfo() {
		System.out.println("Employee Name: \t\t" + this.name);
		System.out.println("Base Salary: \t\t" + this.salary + " TL");
		System.out.println("Working Hours: \t\t" + this.workHours + " hours");
		System.out.println("Hiring Year: \t\t" + this.hireYear);
	}
}
