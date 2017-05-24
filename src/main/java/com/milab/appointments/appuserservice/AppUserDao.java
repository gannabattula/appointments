/**
 * 
 */
package com.milab.appointments.appuserservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.milab.appointments.common.DbConnection;

/**
 * @author
 *
 */
@Repository("appUserDao")
public class AppUserDao {

	public void create(AppUser appUser){
		
		// logic to insert into DB
		
		// get the connection  object
		   Connection con = DbConnection.getDBConnection();
		   
		  // insert query
		   
		   /*String sql = "insert into  app_user(app_user_id ,  user_name ,  gender ,  age ,   address1 ,  address2 ,  area ,  vicinity_area ,  city ,state,  pin ,  user_id ,  password )" +  
  " values (? ,  ? ,  ? ,  ? , ? ,  ? ,  ? ,  ? ,  ? , ?,  ? ,  ? ,  ?)";*/
		   
		   String sql = "insert into  app_user(user_name, gender, address1, address2, area ,  vicinity_area ,  city , state,  user_id ,  password  )" +  
				   " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
		   
		   try {
			PreparedStatement stmt = con.prepareStatement(sql);
			//stmt.setLong(1, appUser.getAppUserId());
			stmt.setString(1, appUser.getUserName());
			stmt.setString(2, appUser.getGender());
			stmt.setString(3, appUser.getAddress1());
			stmt.setString(4, appUser.getAddress2());
			stmt.setString(5, appUser.getArea());
			stmt.setString(6, appUser.getVicinityArea());
			stmt.setString(7, appUser.getCity());
			stmt.setString(8, appUser.getState());
			//stmt.setString(9, appUser.getPin());
			stmt.setString(9, appUser.getUserId());
			stmt.setString(10, appUser.getPassword());
			
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
		    a.setGender(result.getString("gender"));
		    a.setAddress1(result.getString("address1"));
		    a.setAddress2(result.getString("address2"));
		    a.setArea(result.getString("area"));
		    a.setVicinityArea(result.getString("vicinity_area"));
		    a.setCity(result.getString("city"));
		    a.setState(result.getString("state"));
		    //a.setUserName(result.getString("pin"));
		    a.setUserId(result.getString("user_id"));
		    a.setPassword(result.getString("password"));
		    
		    //---
		    list.add(a);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return list;
}



public AppUser findById(Long appUserId){
	
	// logic to insert into DB
	
	// get the connection  object
	   Connection con = DbConnection.getDBConnection();
	   
	  // insert query
	   	   	   
	   String sql = "select app_user_id ,  user_name ,  gender ,  age ,   address1 ,  address2 ,  area , "
	   		+ " vicinity_area ,  city ,state,  pin ,  user_id ,  password  "
	   		+ " from app_user where app_user_id = ?";
	   
	   AppUser a=null;
	   try {
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setLong(1, appUserId);
		ResultSet result = stmt.executeQuery();
		a = new AppUser();;
		while(result.next()) {
		    // ... get column values from this record
			
			a.setAppUserId(result.getLong("app_user_id"));
		    a.setUserName(result.getString("user_name"));
		    a.setGender(result.getString("gender"));
		    a.setAddress1(result.getString("address1"));
		    a.setAddress2(result.getString("address2"));
		    a.setArea(result.getString("area"));
		    a.setVicinityArea(result.getString("vicinity_area"));
		    a.setCity(result.getString("city"));
		    a.setState(result.getString("state"));
		    a.setPin(result.getInt("pin"));
		    a.setUserId(result.getString("user_id"));
		    a.setPassword(result.getString("password"));
		    
		    //---
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	return a;
}


}
