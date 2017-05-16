/**
 * 
 */
package com.milab.appointments.appuserservice;

import java.util.ArrayList;

/**
 * 
 * @author Venkat
 *
 */
public class AppUserService {

	public void createAppUser(AppUser appUser){
		AppUserDao apd = new AppUserDao();		
		
		apd.create(appUser);
		
	}
	
	
	public ArrayList<AppUser> getUsers(){
		AppUserDao apd = new AppUserDao();
		return apd.findAll();
	}
	
	public static void main(String arg[]){
		
		AppUserService  aps = new AppUserService();
		
		AppUser ap = new AppUser();
		ap.setAppUserId(3L);
		ap.setUserName("karthing");
		
		System.out.println("initiating the object" );
		aps.createAppUser(ap);
		
	}
}
