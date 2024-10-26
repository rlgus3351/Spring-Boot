package hello.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName : hello.servlet
 * fileName : TestServlet
 * author : user
 * date : 24. 10. 26.
 * description:
 * =====================================================================================
 * DATE                    AUTHOR                            NOTE
 * =====================================================================================
 * 24. 10. 26.                    user                            최초 생성
 */
/**
 * http://localhost : 8080/text
 **/
@WebServlet(urlPatterns = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TestServlet.service");
        resp.getWriter().println("test");
    }
}
