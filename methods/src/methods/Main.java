package methods;

public class Main {

	public static void main(String[] args) { // Javada Main 'den çalışmaya başlar program.

		sayiBulmaca();

	}

	// metod fonksiyon isimleri camelCase yazılır.

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			//System.out.println("Sayı mevcuttur: " + aranacak);
			mesajVer("Sayı mevcuttur: " + aranacak);
		} else {
			//System.out.println("Sayı mevcut değildir:" + aranacak);
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
	}
	
	
}
