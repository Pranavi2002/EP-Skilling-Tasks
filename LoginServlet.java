

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(pass.equals("admin")){
//			Cookie ck = new Cookie("usersave",user);
//			request.getRequestDispatcher("index.html").include(request,response);
//			pw.print("Login is done successfully");
//			response.addCookie(ck);
			HttpSession hs = request.getSession();
			hs.setAttribute("name",user);
			request.getRequestDispatcher("index.html").include(request,response);
			pw.print("Login is done successfully");
		}
		else {
			pw.print("Please enter the correct login");
		}
					
		}

}
