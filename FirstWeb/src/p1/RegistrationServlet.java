package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("phone");
		String dateofbirth=request.getParameter("dob");
		String address=request.getParameter("address");
		String password=request.getParameter("pass");
		String conformpass=request.getParameter("pass");
		
			out.println("<font color='green'>welcome to registration</font>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request,response);
		}
		
			
		}
		
	
		