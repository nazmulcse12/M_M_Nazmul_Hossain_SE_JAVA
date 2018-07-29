import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

import javax.lang.model.element.QualifiedNameable;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class ProductDao {
	
	private Connection getConnection() throws SQLException {
		new com.mysql.jdbc.Driver();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
		return con;
	}
	
	
	/***Add Product ***/
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
		
		int no = 0;
		try {
			no = st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		con.close();
		return no;
	}
	
	/*** Get All Product Details ***/
	public ArrayList<Product> getAllProducts() throws SQLException{
		Connection con = getConnection();
		Statement st = con.createStatement();
		ResultSet rs = (ResultSet) st.executeQuery("SELECT * FROM PRODUCT");
		ArrayList<Product> products = new ArrayList<>();
		
		while(rs.next()){
			Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getFloat(7), rs.getInt(8), rs.getString(9));
			products.add(product);
		}
		con.close();
		return products;
	}
	
	
	/*** Delete Product ***/
	public int deleteProduct(int productId) throws SQLException {
		Connection con = getConnection();
		Statement st = con.createStatement();
		String sqltext = "DELETE FROM PRODUCT WHERE PRODUCTID="+productId;
		int no = st.executeUpdate(sqltext);
		System.out.println(no);
		return no;
		
	}
	
	/*** Update Product ***/
	public int updateProduct(int productId, int newPrice) throws SQLException {
		Connection con = getConnection();
		Statement st = con.createStatement();
		//String sqltext = "UPDATE PRODUCT SET PRICE="+newPrice+" WHERE PRODUCTID="+productId;
		String sqltext = "UPDATE PRODUCT SET PRICE="+newPrice+" WHERE PRODUCTID="+productId;
		int no = st.executeUpdate(sqltext);
		System.out.println(no);
		return no;
		
	}

	public static void main(String[] args) throws SQLException {
		Product p = new Product(102, "Twinmos 8GB", "RAM", "8GB", 5600, 5000, 5);
		//System.out.println(p);
		ProductDao pdao = new ProductDao();
		//pdao.addProduct(p);
		
		/*for(Product pl : pdao.getAllProducts() ){
			System.out.println(pl);
		}*/
		
		//pdao.deleteProduct(101);
		pdao.updateProduct(101, 3600);
		
	}

}
