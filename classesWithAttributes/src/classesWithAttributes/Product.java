package classesWithAttributes;

public class Product {
	
	public Product (int id,String name,String description,double price,int stockAmount,String renk){
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
		
	}
	
	// Aynı class içerisinde parametre alan ve almayan Product ( Constructor ) tanımladık isteyen parametre girerek isteyen kendisi el ile 
	// Main tarafından yazabilmesine imkan verdik. Buna Overloding (aşırı yükleme)denir.
	// Class'ların birde constructorı olabiliyor, Constructor ( Yapıcı - Oluşturucu anlamındadır.)
	
	public Product() {
		
	}
		

	// attribute veya field denmektedir.( id,name,price )
	// this. benim içerisinde bulunduğum demektir.

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	// this.id = id; 1.Yöntem
	// _id=id; 2.Yöntemle this yazmaktan kurtulduk ve kullanıcıdan gelen id bilgisi
	// ile class içerisindeki _id karışmamış oldu..
}
