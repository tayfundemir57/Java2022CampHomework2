package classes;

public class Main {

	public static void main(String[] args) { // classların temel özelliği gruplama yapmaktır.
		// reference type // Class'lar referans tiptir. 
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
	//	System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int [] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		sayilar1[1] = 11;
		sayilar1[2] = 12;
		System.out.println(sayilar2[0]);
		System.out.println(sayilar2[1]);
		System.out.println(sayilar2[2]);
		
		
		// 10,11,12
		// Diziler referans tiptir. byte int string olmasının bir önemi yoktur.
		//CustomerManager customerManager ifadesini oluşturduğunda bellekte bulunan Stack bölümünde tanımlanıyor.
		//CustomerManager customerManager1 = new CustomerManager dediğimizde Heap alanına customerManager1 nesnesi oluşuyor.
		
		
		
	}

}


