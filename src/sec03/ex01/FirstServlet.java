package sec03.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/first")*/
public class FirstServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws  ServletException, IOException { 
      response.setContentType("text/html;charset=utf-8");
      
      // second 서블릿으로 Get방식으로 파라미터를 넘긴다
      RequestDispatcher dispatch = request.getRequestDispatcher("second?name=lee");  
      // 요청,응답 을 넘긴다 
      dispatch.forward(request, response);
   }
}

