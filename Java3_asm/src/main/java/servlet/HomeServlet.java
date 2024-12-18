package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.imageio.IIOException;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

import entity.*;
import daos.*;
/**
 * Servlet implementation class Home
 */
@MultipartConfig()
@WebServlet({"/home/index"})
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NewsDAO homedao = new NewsDAOlmpl();
        String path = request.getServletPath();


        // Mặc định: hiển thị danh sách bài đăng
        List<News> list = homedao.findAll();
        request.setAttribute("list", list);
        request.setAttribute("page", "Home.jsp");
        request.getRequestDispatcher("/views/layoutUser.jsp").forward(request, response);
    }
}