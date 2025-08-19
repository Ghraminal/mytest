package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DabmantionDao;

@WebServlet("/insert")
public class BadmintonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BadmintonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      String resv_no = request.getParameter("resv_no");
	      String resv_date = request.getParameter("resv_date");
	      String cust_no = request.getParameter("cust_no");

	      DabmantionDao dao = new DabmantionDao();
	      dao.insertName(resv_no, cust_no, resv_date);

	      response.sendRedirect("list");
	  }
	

}
