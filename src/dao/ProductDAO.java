package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DatabaseConnection;
import entity.Product;

public class ProductDAO {
	public static void Create (Product product) {
		String sql = "INSERT INTO product (quantity, sku, description, price, max_discount) value (?, ?, ?, ?, ?)";

		try (
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement state = conn.prepareStatement(sql)
		) {

			state.setInt(1, product.getQuantity());
			state.setString(2, product.getSku());
			state.setString(3, product.getDescription());
			state.setFloat(4, product.getPrice());
			state.setFloat(5, product.getMaxDiscount());

			state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Product> List () {
		List<Product> products = new ArrayList<>();
		String sql = "SELECT * FROM product";

		try (
			Connection conn = DatabaseConnection.getConnection();
			Statement state = conn.createStatement();
			ResultSet result = state.executeQuery(sql)
		) {
			while(result.next()) {
				int id = result.getInt("id");
				int quantity = result.getInt("quantity");
				String sku = result.getString("sku");
				String description = result.getString("description");
				float price = result.getFloat("price");
				float maxDiscount = result.getFloat("max_discount");

				Product product = new Product(id, quantity, sku, description, price, maxDiscount);

				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}

	public static void Update (Product product) {
		String sql = "UPDATE product SET description = ?, sku = ? , max_discount = ?, price = ?, quantity = ? WHERE id = ?";

		try (
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement state = conn.prepareStatement(sql);
		) {
			state.setString(1, product.getDescription());
			state.setString(2, product.getSku());
			state.setFloat(3, product.getMaxDiscount());
			state.setFloat(4, product.getPrice());
			state.setInt(5, product.getQuantity());
			state.setInt(6, product.getId());

			state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Delete (int id) {
		String sql = "DELETE FROM product WHERE id = ?";

		try (
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement state = conn.prepareStatement(sql);
		) {
			state.setInt(1, id);

			state.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
