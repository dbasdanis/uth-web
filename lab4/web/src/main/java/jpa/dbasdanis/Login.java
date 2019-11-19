package jpa.dbasdanis;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        AccountsManager.begin();
        Accounts account = AccountsManager.read(username);
        
        
        if(account != null && password.equals(account.getPassword())) {
        	out.println("Welcome "+ account.getName() +".");
        }
        else {
        	out.println("Unable to login.");
        	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        	rd.include(request, response);
        } 
        
        AccountsManager.end();
    }
}
