package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		 // Bir class sadece bir classı inheritance edebilir.
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		tarimKrediManager.Hesapla();

		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		
	}

}
