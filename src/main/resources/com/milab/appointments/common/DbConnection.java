/**
 * 
 */
package com.milab.appointments.common;

/**
 * @author rgannabattula
 *
 */
public class DbConnection {

	/**
	 * 
	 */
	public DbConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getDBConnection(){
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/appointments","rama","rama");  
			
			//here appointments is database name, rama is username and password  
			return con;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbConnection.getDBConnection();
		System.out.println("DB connection established");

	}

}
