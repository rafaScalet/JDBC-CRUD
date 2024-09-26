package menu;

import java.util.List;

import dao.ProductDAO;
import entity.Product;

public class ListMenu {
	public static void show () {
		List<Product> products = ProductDAO.List();

		for (Product p : products) {
			System.out.println(
				"\nID: " + p.getId() +
				"\nQuantity: " + p.getQuantity() +
				"\nSKU: " + p.getSku() +
				"\nDescription: " + p.getDescription() +
				"\nPrice: " + p.getPrice() +
				"\nMax Discount: " + p.getMaxDiscount()
			);
		}
	}
}
