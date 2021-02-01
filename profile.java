

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
 * Servlet implementation class profile
 */
@WebServlet("/profile")
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
//		request.getRequestDispatcher("index.html").include(request,response);
//		Cookie ck[] = request.getCookies();
//		if(ck!=null) {
//			pw.print("Welcome"+" "+ck[0].getValue());
//		}
//		else {
//			pw.print("Please login first");
//		}
		request.getRequestDispatcher("index.html").include(request,response);
		HttpSession hs = request.getSession();
		String s = (String) hs.getAttribute("name");
		if(s!=null) {
			pw.print("Welcome"+" "+s);
		}
		else {
			pw.print("Please login first");
		}
	}
}
