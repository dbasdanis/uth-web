package jpa.dbasdanis;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Registration() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String username = request.getParameter("username");
        String password = request.getParameter("password");        
        
		AccountsManager.begin();
        if(AccountsManager.read(username)!=null) {
        	out.println("There is already an account with this email.");
        }
        else {
        	AccountsManager.create(username, password);
        	out.println("You are successfully registered.");
        }
        AccountsManager.end();
	}

}
