package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.DatabaseConnection;
import entity.Product;

public class ProductDAO {
	public static void Create (Product product) {
		String sql = "INSERT INTO product (quantity, sku, description, price, max_discount) value (?, ?, ?, ?, ?)";

		try(
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement state = conn.prepareStatement(sql)) {

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
}
