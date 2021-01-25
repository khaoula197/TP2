package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class ConnectBd {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/javaproject";
    static final String USER = "root";
	static final String PASS = "";
	static  Connection conn = null;
	static Statement stmt = null;
	
	 public User getUser(String login, String password) throws SQLException
	   {  
			conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
		      User e= null;
		      Statement stmt= (Statement) this.conn.createStatement();
		      String sql = "SELECT * FROM user where login='"+login+"' and password='"+password+"'";
		      ResultSet rs = stmt.executeQuery(sql);
		      while(rs.next()){
		    	e=  new User(rs.getString(2), rs.getString(3));
		      }
			return e;
		   
	   }
	   
   
   public   ArrayList<Product>FindAllProducts() throws SQLException{
	   ArrayList<Product> produits = new ArrayList<Product>();
	   try {
		   conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS); 
		   Statement stmt= (Statement) this.conn.createStatement();
		   ResultSet rs = stmt.executeQuery("SELECT * FROM product");
		   while(rs.next()){
			   produits.add(new Product(rs.getString("vetements"),rs.getString("accessoire")));
		      }
	   }catch(SQLException u) {
		   u.printStackTrace();
	   }  
	   return produits;
		   
	   }
	   
	   
	  
	   
	   
   }


