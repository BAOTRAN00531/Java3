package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import daos.CategoriesDAO;
import daos.CategoriesDAOlmpl;
import entity.Categories;
import daos.*;
import entity.*;

/**
 * Servlet implementation class LayoutServlet
 */
@WebServlet({"/home/show","/bloglist/show", "/blogdetail/show"})
public class LayoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LayoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoriesDAO catedao = new CategoriesDAOlmpl();
		NewsDAO newsdao = new NewsDAOlmpl();
		String uri = request.getRequestURI();
		if(uri.contains("/home/show")) {
			response.sendRedirect("/Java3_asm/home/index");
		}
		if(uri.contains("/bloglist/show")) {
			response.sendRedirect("/Java3_asm/bloglist/index");
		}
		if(uri.contains("/blogdetail/show")) {
			response.sendRedirect("/Java3_asm/blogdetail/index");
		}
		
		if (uri.contains("/login")) {
            request.setAttribute("page", "/views/login.jsp");
        }
        if (uri.contains("/register")) {
            request.setAttribute("page", "/views/register.jsp");
        }
		
		List<Categories> listCate = catedao.findAll();
		request.setAttribute("listCategory", listCate);
		List<News> mostView = newsdao.topViewed();
		System.out.println(mostView);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
