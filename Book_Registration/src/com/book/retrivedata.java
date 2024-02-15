package com.book;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class retrivedata
 */
@WebServlet("/retrivedata")
public class retrivedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public retrivedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				request.setAttribute("bname", list1);
				request.setAttribute("edt", list2);
				request.setAttribute("price", list3);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		
		request.getRequestDispatcher("BookList.jsp").forward(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
}
