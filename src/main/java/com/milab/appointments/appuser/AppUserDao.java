/**
 * 
 */
package com.milab.appointments.appuser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.milab.appointments.common.DbConnection;

/**
 * @author Venkat
 *
 */
public class AppUserDao {

	public void create(AppUser appUser){
		
		// logic to insert into DB
		
		// get the connection  object
		   Connection con = DbConnection.getDBConnection();
		   
		  // insert query
		   
		   /*String sql = "insert into  app_user(app_user_id ,  user_name ,  gender ,  age ,   address1 ,  address2 ,  area ,  vicinity_area ,  city ,state,  pin ,  user_id ,  password )" +  
  " values (? ,  ? ,  ? ,  ? , ? ,  ? ,  ? ,  ? ,  ? , ?,  ? ,  ? ,  ?)";*/
		   
		   String sql = "insert into  app_user(app_user_id ,  user_name )" +  
				   " values (? ,  ? )";
		   
		   try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, appUser.getAppUserId());
			stmt.setString(2, appUser.getUserName());
			
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
