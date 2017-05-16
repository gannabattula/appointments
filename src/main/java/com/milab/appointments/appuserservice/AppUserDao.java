/**
 * 
 */
package com.milab.appointments.appuserservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		   
		   String sql = "insert into  app_user(user_name )" +  
				   " values (? )";
		   
		   try {
			PreparedStatement stmt = con.prepareStatement(sql);
			//stmt.setLong(1, appUser.getAppUserId());
			stmt.setString(1, appUser.getUserName());
			
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void update(AppUser appUser){
		
		// logic to insert into DB
		
		// get the connection  object
		   Connection con = DbConnection.getDBConnection();
		   
		  // insert query
		   
		   
		   
		   String sql = "update app_user set user_name = ? where app_user_id=?";
		   
		   
		   try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, appUser.getUserName());
			stmt.setLong(2, appUser.getAppUserId());
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public ArrayList<AppUser> findAll(){
	
	// logic to insert into DB
	
	// get the connection  object
	   Connection con = DbConnection.getDBConnection();
	   
	  // insert query
	   
	   
	   
	   String sql = "select app_user_id ,  user_name ,  gender ,  age ,   address1 ,  address2 ,  area , "
	   		+ " vicinity_area ,  city ,state,  pin ,  user_id ,  password  "
	   		+ " from app_user";
	   
	   ArrayList<AppUser> list = new ArrayList<AppUser>();
	   
	   try {
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result = stmt.executeQuery();
		
		while(result.next()) {
		    // ... get column values from this record
			AppUser a = new AppUser();
			a.setAppUserId(result.getLong("app_user_id"));
		    a.setUserName(result.getString("user_name"));
		    list.add(a);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return list;
}


}
