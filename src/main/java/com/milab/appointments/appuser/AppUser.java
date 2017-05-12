/*
 * This is entity for App user object
 */
package com.milab.appointments.appuser;

public class AppUser {

	private Long appUserId;
	private String userName;
	private  int age;
	private String address1;
	private String address2;
	private String area;
	private String vicinityArea;
	private String city;
	private String state;
	private String userId;
	private Integer pin;
	private String password;
	
	
	public AppUser(){
		
	}
	
	/**
	 * @param appUserId
	 * @param userName
	 * @param age
	 * @param address1
	 * @param address2
	 * @param area
	 * @param vicinityArea
	 * @param city
	 * @param state
	 * @param userId
	 * @param pin
	 * @param password
	 */
	public AppUser(Long appUserId, String userName, int age, String address1,
			String address2, String area, String vicinityArea, String city,
			String state, String userId, Integer pin, String password) {
		super();
		this.appUserId = appUserId;
		this.userName = userName;
		this.age = age;
		this.address1 = address1;
		this.address2 = address2;
		this.area = area;
		this.vicinityArea = vicinityArea;
		this.city = city;
		this.state = state;
		this.userId = userId;
		this.pin = pin;
		this.password = password;
	}
	/**
	 * @return the appUserId
	 */
	public Long getAppUserId() {
		return appUserId;
	}
	/**
	 * @param appUserId the appUserId to set
	 */
	public void setAppUserId(Long appUserId) {
		this.appUserId = appUserId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return the vicinityArea
	 */
	public String getVicinityArea() {
		return vicinityArea;
	}
	/**
	 * @param vicinityArea the vicinityArea to set
	 */
	public void setVicinityArea(String vicinityArea) {
		this.vicinityArea = vicinityArea;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the pin
	 */
	public Integer getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
