package com.book;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 final String url = "jdbc:mysql://127.0.0.1:3306/bookdata";
		 final String username = "root";
		 final String password = "1234";
		 
		 String bookname = request.getParameter("bname");
		 String bookedition = request.getParameter("bedition");
		 double bookprice = Double.parseDouble(request.getParameter("bprice"));
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//for loads the drivers
		 
		 try {
			Connection con = DriverManager.getConnection(url,username,password);
			String query = "insert into bookregistration values (?,?,?)";
			PreparedStatement pre = con.prepareStatement(query);
			pre.setString(1, bookname);
			pre.setString(2, bookedition);
			pre.setDouble(3, bookprice);
			

			int c = pre.executeUpdate();
                if(c>0) response.getWriter().println("added successfully");
                else response.getWriter().println("added successfully"); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
