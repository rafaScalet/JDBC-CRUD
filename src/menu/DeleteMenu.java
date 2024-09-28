package menu;

import java.util.Scanner;

import dao.ProductDAO;

public class DeleteMenu {
	public static void show () {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);

	System.out.print("\nEnter the id for delete: ");
	int id = in.nextInt();

	ProductDAO.Delete(id);
	}
}
