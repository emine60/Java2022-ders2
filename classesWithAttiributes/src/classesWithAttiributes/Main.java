package classesWithAttiributes;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Dell Laptop",10000,7,"Siyah");

		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Dell Laptop");
		//product.setPrice(10000);
		//product.setStockAmount(7);

		ProductManeger productManeger = new ProductManeger();
		productManeger.Add(product);

		System.out.println(product.getKod());
	}

}
