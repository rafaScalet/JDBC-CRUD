package menu;

import java.util.Scanner;

import dao.ProductDAO;
import entity.Product;

public class UpdateMenu {
	public static void show () {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);

	System.out.print("\nEnter the id for update: ");
	int id = in.nextInt();

	System.out.print("Enter the quantity: ");
	int quantity = in.nextInt();

	System.out.print("Enter the SKU: ");
	String sku = in.next();

	System.out.print("Enter the description: ");
	String description = in.next();

	System.out.print("Enter the price: ");
	float price = in.nextFloat();

	System.out.print("Enter the max discount: ");
	float maxDiscount = in.nextFloat();

	Product product = new Product(quantity, sku, description, price, maxDiscount);
	product.setId(id);
	ProductDAO.Update(product);
	}
}
