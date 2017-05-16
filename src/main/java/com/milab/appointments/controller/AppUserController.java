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
		
		AppUserService appUserService = new AppUserService();
		ArrayList<AppUser> users = appUserService.getUsers();
		
		request.setAttribute("users", users);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/AppUserList.jsp");
        dispatcher.forward(request, response);
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
		
		System.out.println("user Name :" + userName);
		
		AppUserService appUserService = new AppUserService();
		appUserService.createAppUser(appUser);
		
	}

}
