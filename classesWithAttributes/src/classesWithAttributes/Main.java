package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		// Ürün özelliklerini girme 1.Yöntem Constructor ile..
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		/* Ürün özelliklerini Girme işlemi 2. Yöntem
		 * product.setName("Laptop"); product.setId(1);
		 * product.setDescription("Asus Laptop"); product.setPrice(5000);
		 * product.setStockAmount(3);
		 */
		

		/*
		 * System.out.println(product.id); System.out.println(product.name);
		 * System.out.println(product.description); System.out.println(product.price);
		 * System.out.println(product.stockAmount);
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		// Solid prensibi.
	}

}
