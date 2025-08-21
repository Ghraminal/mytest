package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloMVC
 */
@WebServlet("/hello")
public class helloMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String resv_no = request.getParameter("resv_no");
        String cust_no = request.getParameter("cust_no");
        String resv_date = request.getParameter("resv_date");
        String court_no = request.getParameter("court_no");

        request.setAttribute("message1", resv_no);
        request.setAttribute("message2", cust_no);
        request.setAttribute("message3", resv_date);
        request.setAttribute("message4", court_no);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
	