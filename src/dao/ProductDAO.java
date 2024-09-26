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
				Product product = new Product();

				product.setId(result.getInt("id"));
				product.setQuantity(result.getInt("quantity"));
				product.setDescription(result.getString("description"));
				product.setSku(result.getString("sku"));
				product.setPrice(result.getFloat("price"));
				product.setMaxDiscount(result.getFloat("max_discount"));
				
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return products;
	}
}
