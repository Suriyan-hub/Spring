package com.springdemo.SpringBeanLifeCycle;

import java.sql.*;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class UserDAO {
	private String driver;
	private String url;
	private String username;
	private String password;
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException 
	{
		System.out.println("Insisde the init()");
		createConnectionDB();
	}
	
	public void createConnectionDB() throws ClassNotFoundException, SQLException 
	{
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
	}
	public void selectUsers() throws SQLException, ClassNotFoundException
	{
		System.out.println("Fetching the datas....");
		//createConnectionDB();
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("Select * from user");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2));
			System.out.println();
		}
	}
	
		
		public void closeConnection() throws SQLException 
		{
			
			con.close();
			System.out.println("Connecion Closed");
		}
		//@PreDestroy
		public void destroy() throws SQLException {
			System.out.println("Inside destroy method");
			closeConnection();
		}

}
