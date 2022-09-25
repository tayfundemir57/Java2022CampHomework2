package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// MetodOverloading -

		DortIslem dortIslem = new DortIslem();
		int toplaYöntem1 = dortIslem.topla(5, 5);
		System.out.println(toplaYöntem1);
		int toplaYöntem2 = dortIslem.topla(2, 3, 8);
		System.out.println(toplaYöntem2);
	}

}
