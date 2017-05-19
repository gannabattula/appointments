package com.milab.appointments.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.milab.appointments.appuserservice.AppUser;
import com.milab.appointments.appuserservice.AppUserService;

/**
 * Servlet implementation class AppUserController
 */
public class AppUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("I am get method");
		
		String parameter = request.getParameter("appUserId");
		
		AppUserService appUserService = new AppUserService();
		
		
		if(parameter != null ){
			Long userId = null;
			// get single user details 
			if(!parameter.isEmpty()){
				userId = Long.parseLong(parameter);
			}
			try {
				AppUser user = appUserService.getUserById(userId);
				request.setAttribute("user", user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				request.setAttribute("error", e.getMessage());
			}
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/updateRegistration.jsp");
	        dispatcher.forward(request, response);
			
		}else{
					
			ArrayList<AppUser> users = appUserService.getUsers();
			
			request.setAttribute("users", users);
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/AppUserList.jsp");
	        dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("You are in right place -- post method ");
		
		AppUser appUser = new AppUser();
		
		String userName = request.getParameter("userName");
		appUser.setUserName(userName);
		
		String gender = request.getParameter("gender");
		appUser.setGender(gender);
		
		 String address1 = request.getParameter("address1");
		  appUser.setAddress1(address1);
		  
		  String address2 = request.getParameter("address2");
		  appUser.setAddress2(address2);
		  
		  String area = request.getParameter("area");
		  appUser.setArea(area);
		  
		  String VicinityArea = request.getParameter("vicinityArea");
		  appUser.setVicinityArea(VicinityArea);
		  
		  String city = request.getParameter("city");
		  appUser.setCity(city);
		  
		  String state = request.getParameter("state");
		  appUser.setState(state);
		  
		  //Integer pin = Integer.parseInt("pin");
		  //appUser.setPin(pin);
		  
		  String UserId = request.getParameter("userId");
		  appUser.setUserId(UserId);
		  
		  String password = request.getParameter("password");
		  appUser.setPassword(password);
		
		  //Integer age = Integer.parseInt("age");
		  //appUser.setAge(age);
		
		System.out.println("user Name :" + userName);
		
		AppUserService appUserService = new AppUserService();
		appUserService.createAppUser(appUser);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("appUserController");
        dispatcher.forward(request, response);
        
	}

}
