package com.beskontakt.mobilewallet.helper;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionsHelper {
	public static final String DRIVER = "org.postgresql.Driver";
	public static final String URL = "jdbc:postgresql://db08t.t01.i-free.ru:5432/mobile_wallet_test";
	public static final String USER = "mobile_wallet_test";
	public static final String PASSWORD = "cohthahciofauche";
	public static final String EMAIL = "'test@mail.com'";
	
public Connection connect(){
	
	Connection connection = null;
	
	try {		 
		Class.forName(DRIVER);
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your PostgreSQL JDBC Driver? "
				+ "Include in your library path!");
		e.printStackTrace();
		
	}
	try {
		connection = DriverManager.getConnection(URL, USER, PASSWORD);

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		
	}
	
	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
	return connection;
} 

public void checkClientWithEmailExist() throws SQLException{
	Connection connection = connect();
	String selectTableSQL = "SELECT cl_client.id, cl_client.email FROM tsm_two.cl_client WHERE cl_client.email = " + EMAIL + ";";	
	Statement statement = null;
	statement = connection.createStatement();
	ResultSet rs = statement.executeQuery(selectTableSQL);
	while (rs.next()) {
        String userid = rs.getString("id");
        String email = rs.getString("email");
        System.out.println("userid : " + userid + "    "  + "email : " + email);
    }
	connection.close();
}
}


