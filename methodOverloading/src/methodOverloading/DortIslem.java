package methodOverloading;

public class DortIslem {

	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	
	//Methot Overloading işlemi örnek; normalde bir ekranda iki sayı toplarken daha sonra programda güncelleme yapılmak istendi-
	//topla adında ikinci bir metot yaptın ancak alacağı paramatreyi üç sayıya çıkardın yapılabilir.
	//topla isimlerinin aynı olması birşey değiştirmez programı aksatmaz alacağı parametre sayıları nedeniyle farkları vardır zaten.
	
}
