package ie.gmit.sw;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) throws Exception {
		CatalogueParser cp = new CatalogueParser("./catalogue.xml");
		
		String[] names = cp.getproductNames();
		Arrays.stream(names).forEach(System.out::println);
		
		Product[] products = cp.getProducts();
		Arrays.stream(products).forEach(System.out::println);
		
		
	}
}
