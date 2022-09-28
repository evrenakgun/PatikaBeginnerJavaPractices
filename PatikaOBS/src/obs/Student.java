package obs;

public class Student {
	String name;
	String studentNo;
	Course tarih;
	Course fizik;
	Course kimya;
	double averageTarih;
	double averageFizik;
	double averageKimya;
	double averageTotal;
	boolean isPass;
	
	public Student(String name, String studentNo, Course tarih, Course fizik, Course kimya) {
		this.name = name;
		this.studentNo = studentNo;
		this.tarih = tarih;
		this.fizik = fizik;
		this.kimya = kimya;
		calculateAverage();
		this.isPass = false;
	}
	
	public void examNotes(int tarih, int fizik, int kimya) {
		if(tarih >= 0 && tarih <= 100){
			this.tarih.note = tarih;
        }
		
		if(fizik >= 0 && fizik <= 100){
			this.fizik.note = fizik;
        }

		if(kimya >= 0 && kimya <= 100){
			this.kimya.note = kimya;
        }
	}
	
	public void sozluNot(int tarihSozlu, int fizikSozlu, int kimyaSozlu) {
		if(tarihSozlu >= 0 && tarihSozlu <= 100){
			this.tarih.sozluNot = tarihSozlu;
        }
		
		if(fizikSozlu >= 0 && fizikSozlu <= 100){
			this.fizik.sozluNot = fizikSozlu;
        }

		if(kimyaSozlu >= 0 && kimyaSozlu <= 100){
			this.kimya.sozluNot = kimyaSozlu;
        }
	}
	
	public void isPass() {
		this.isPass = isCheckPass();
		printNote();
		System.out.println("Ortalama: " + this.averageTotal);
		if (this.isPass) {
			System.out.println("Tebrikler sinifi gectiniz.");
		} else {
			System.out.println("Uzgunuz sinifta kaldiniz.");
		}
	}
	
	public void calculateAverage() {
		// Her dersin sözlü notunun etkisini %20 olarak kabul ettik.
		this.averageTarih = (this.tarih.sozluNot * 0.2) + (this.tarih.note * 0.8);
		this.averageFizik = (this.fizik.sozluNot * 0.2) + (this.fizik.note * 0.8);
		this.averageKimya = (this.kimya.sozluNot * 0.2) + (this.kimya.note * 0.8);
		this.averageTotal = (this.averageTarih + this.averageFizik + this.averageKimya) / 3.0;
	}
	
	public boolean isCheckPass() {
		calculateAverage();
		return this.averageTotal > 55;
	}
	
	public void printNote() {
		System.out.println("***************************************************");
		System.out.println("Ogrenci Adi: " + this.name);
		System.out.println("Ogrenci No : " + this.studentNo);
		System.out.println("-                                           -");
		System.out.println("Sinav notlarinin ortalamaya etkisi %80'dir.");
		System.out.println("Tarih= " + this.tarih.note);
		System.out.println("Fizik= " + this.fizik.note);
		System.out.println("Kimya= " + this.kimya.note);
		System.out.println("-                                           -");
		System.out.println("Sozlu notlarinin ortalamaya etkisi %20'dir.");
		System.out.println("Tarih= " + this.tarih.sozluNot);
		System.out.println("Fizik= " + this.fizik.sozluNot);
		System.out.println("Kimya= " + this.kimya.sozluNot);
		System.out.println("-                                           -");
	}
}
