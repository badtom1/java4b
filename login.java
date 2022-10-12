package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet(urlPatterns="/login",initParams=@WebInitParam(name="rvce",value="rvce"))
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out= response.getWriter();
	response.setContentType("text/html");
	String usr= request.getParameter("username");
	String pwd=request.getParameter("password");
	ServletConfig ch = getServletConfig();
	String username = ch.getInitParameter("rvce");
	String password = ch.getInitParameter("rvce");
	if (usr.equalsIgnoreCase(username)&&pwd.equalsIgnoreCase(password)) {
		response.sendRedirect("welcome.html");      
	}
	else {
		response.sendError(404, "invalid");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
