package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);

	}

	// void operasyon demek bir iş yapmasını istemektir. ( Fonksiyon )

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) { // Bu fonksiyon int türünde 2 değer beklemekte ve int türünde sonuç
													// geri döndürmektedir.

		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi; // 1. yöntem.
			// toplam+=sayi; // 2.yöntem.
		}

		return toplam;
	}

	public static String sehirVer() { // Bu fonksiyon String türünde değer döndürmektedir.
		return "Ankara";
	}

}
