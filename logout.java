

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
 * Servlet implementation class logout
 */
@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
//		request.getRequestDispatcher("index.html").include(request,response);
//		Cookie ck = new Cookie("usersave","");
//		ck.setMaxAge(0);
//		response.addCookie(ck);
//		pw.print("Logout successful");
		HttpSession hs = request.getSession();
		hs.invalidate();
		request.getRequestDispatcher("index.html").include(request,response);
		pw.print("Logout successful");
	}

}
