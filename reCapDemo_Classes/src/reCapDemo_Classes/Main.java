package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();

		int toplamaSonuc = dortIslem.Topla(12, 6);
		System.out.println(toplamaSonuc);

		int cikarmaSonuc = dortIslem.Cikar(12, 6);
		System.out.println(cikarmaSonuc);

		int carpmaSonuc = dortIslem.Carp(12, 6);
		System.out.println(carpmaSonuc);

		int bolmeSonuc = dortIslem.Bolme(12, 6);
		System.out.println(bolmeSonuc);

	}

}
