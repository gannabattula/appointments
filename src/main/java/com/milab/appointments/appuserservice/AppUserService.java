/**
 * 
 */
package com.milab.appointments.appuserservice;

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
	
	
	public static void main(String arg[]){
		
		AppUserService  aps = new AppUserService();
		
		AppUser ap = new AppUser();
		ap.setAppUserId(3L);
		ap.setUserName("karthing");
		
		System.out.println("initiating the object" );
		aps.createAppUser(ap);
		
	}
}
