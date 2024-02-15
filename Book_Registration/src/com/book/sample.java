package com.book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class sample {
	
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		
		
		
		final String url = "jdbc:mysql://127.0.0.1:3306/bookdata";
		 final String username = "root";
		 final String password = "1234";
		 
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//for loads the drivers
			 
			 try {
				Connection con = DriverManager.getConnection(url,username,password);
				String query = "select * from bookregistration";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				while(rs.next()){
					list1.add(rs.getString(1));
					list2.add(rs.getString(2));
					list3.add(rs.getDouble(3));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(list1);
			 System.out.println(list2);
			 System.out.println(list3);
			 
		
	}
}
	
	 


