/**
 * 
 */
package com.milab.appointments.appuserservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author
 *
 */
@Service("appUserService")
public class AppUserService {

	@Autowired
	AppUserDao appUserDao;
	
	public void createAppUser(AppUser appUser){
		
		appUserDao.create(appUser);
		
	}
	
	public void updateAppUser(AppUser appUser){
		
		appUserDao.update(appUser);
		
	}
	
	
	public ArrayList<AppUser> getUsers(){
		return appUserDao.findAll();
	}
	
	public AppUser getUserById(Long appId) throws Exception{
		if(appId == null){
			throw new Exception("App User Id Is Mandatory");
		}
		return appUserDao.findById(appId);
	}
	
	
}
