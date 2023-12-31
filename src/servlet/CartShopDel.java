package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Shop_CARTDao;



/**
 * Servlet implementation class CartShopDel
 */
@WebServlet("/cartshopdel")
public class CartShopDel extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String esid = request.getParameter("esid");
		
		Shop_CARTDao.getDeleteDD(Integer.parseInt(esid));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
