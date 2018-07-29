import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.lang.model.element.QualifiedNameable;

import com.mysql.jdbc.PreparedStatement;

public class ProductDao {
	
	private Connection getConnection() throws SQLException {
		new com.mysql.jdbc.Driver();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
		return con;
	}
	
	public int  addProduct(Product product) throws SQLException {
		// Calculation of Profit percentence & availability
		float profitPercentage;
		profitPercentage = ( product.getPrice()-product.getOriginalCost() ) * 100 / product.getOriginalCost();
		
		String availability;
		if(product.getQuantity() > 0){
			availability = "In Stock";
		}
		else {
			availability = "Out of Stock";
		}
		
		// Connecting Database & execute query
		Connection con = getConnection();
		PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?,?,?,?,?)");
		
		st.setInt(1, product.getProductId());
		st.setString(2, product.getName());
		st.setString(3, product.getProductType());
		st.setString(4, product.getMemory());
		st.setInt(5, product.getPrice());
		st.setInt(6, product.getOriginalCost());
		st.setFloat(7, profitPercentage);
		st.setInt(8, product.getQuantity());
		st.setString(9, availability);
		
		int no= st.executeUpdate();
		con.close();
		return no;
	}

	public static void main(String[] args) throws SQLException {
		Product p = new Product(101, "Twinmos 4GB", "RAM", "4GB", 3600, 3000, 5);
		System.out.println(p);
		ProductDao pdao = new ProductDao();
		pdao.addProduct(p);
		
	}

}
