package obs;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Ilber Hoca", "05346623232", "TRH");
		Teacher t2 = new Teacher("Einstein", "05357895452", "FZK");
		Teacher t3 = new Teacher("Michael Faraday", "05383219891", "KIM");
		
		Course tarih = new Course("Tarih", "TRH101", "TRH");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KIM101", "KIM");
		
		tarih.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1 = new Student("Polat Alemdar", "123", tarih, fizik, kimya);
		s1.examNotes(100, 90, 95);
		s1.sozluNot(100, 100, 100);
		s1.isPass();
		
		Student s2 = new Student("Abdulhey Coban", "456", tarih, fizik, kimya);
		s2.examNotes(30, 40, 40);
		s2.sozluNot(20, 30, 10);
		s2.isPass();
		
		Student s3 = new Student("Memati Bas", "789", tarih, fizik, kimya);
		s3.examNotes(40, 90, 87);
		s3.sozluNot(75, 95, 90);
		s3.isPass();
		
	}
}
