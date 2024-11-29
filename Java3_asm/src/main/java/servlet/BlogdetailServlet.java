package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import entity.News;
import daos.NewsDAOlmpl;
import daos.NewsDAO;

@MultipartConfig
@WebServlet("/blogdetail/show/*")  // Đảm bảo URL khớp với mẫu này
public class BlogdetailServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy phần còn lại của URL sau "/blogdetail/show/"
        String pathInfo = request.getPathInfo(); 
        if (pathInfo != null && pathInfo.length() > 1) {
            String id = pathInfo.substring(1);  // Loại bỏ dấu "/" ở đầu
            
            // Truy vấn bài viết theo ID
            NewsDAO newsDAO = new NewsDAOlmpl();
            News news = newsDAO.findById(id);
            
            if (news != null) {
                request.setAttribute("news", news);
                request.getRequestDispatcher("/views/blogdetail.jsp").forward(request, response);
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Bài viết không tồn tại.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID không hợp lệ.");
        }
    }
}
