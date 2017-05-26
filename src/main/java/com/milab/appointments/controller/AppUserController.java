package com.milab.appointments.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.milab.appointments.appuserservice.AppUser;
import com.milab.appointments.appuserservice.AppUserService;
import com.milab.appointments.common.ApplicationContextProvider;

/**
 * http://websystique.com/spring-4-mvc-tutorial/
 * 
 * 
 * Servlet implementation class AppUserController
 */
@Controller
@RequestMapping(value="/appUser")
public class AppUserController {
	private static final long serialVersionUID = 1L;
    
	@Autowired
	AppUserService appUserService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @RequestMapping(value="/{appUserId}", method = RequestMethod.GET)
	protected String doGet(ModelMap model, @PathVariable Long appUserId)  {
		// TODO Auto-generated method stub
		
		System.out.println("I am get method");
		
		if(appUserId != null ){
			// get single user details 
			try {
				AppUser user = appUserService.getUserById(appUserId);
				model.addAttribute("user", user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				model.addAttribute("error", e.getMessage());
			}
			return "updateRegistration";
			
		}else{
					
			return getAppUserList(model);
			
		}
	}

    
    @RequestMapping(method = RequestMethod.GET)
   	protected String getAppUserList(ModelMap model)  {
   		// TODO Auto-generated method stub
   		
   		System.out.println("I am get method  app user list");
   		
   		
   			
   			ArrayList<AppUser> users = appUserService.getUsers();
   			
   			model.addAttribute("users", users);
   			
   	        return "AppUserList";
   			
   	}

    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @RequestMapping(method = RequestMethod.POST)
	protected String createAppUser(ModelMap model, @ModelAttribute("appUser")AppUser appUser )  {
		// TODO Auto-generated method stub
		System.out.println("You are in right place -- post method ");
		
		if(appUser.getAppUserId()!= null && appUser.getAppUserId() >= 0L){
			
			appUser.setAppUserId(appUser.getAppUserId());
			//update
			appUserService.updateAppUser(appUser);
		}else{
			appUserService.createAppUser(appUser);
		}
		
	 return getAppUserList(model);
		
	}

    
    @RequestMapping(value="/registrationForm",method = RequestMethod.GET)
   	protected String getAppUserForm(ModelMap model )  {
   		// TODO Auto-generated method stub
   		System.out.println("You are in right place -- post method ");
   		
   		AppUser appUser = new AppUser();
   		model.addAttribute("appUser", appUser);
   	 return "CreatingRegistration";
   		
   	}

}
