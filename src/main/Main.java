package main;

import java.util.Scanner;
import menu.SaveMenu;
import menu.ProductMenu;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			ProductMenu.show();
			int option = in.nextInt();

			switch (option) {
				case 1:
					SaveMenu.show();
					break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					System.out.println("\nExiting...");
					in.close();
					return;
				default:
					System.out.println("\nEnter a valid option");
					break;
			}
		}
	}
}
