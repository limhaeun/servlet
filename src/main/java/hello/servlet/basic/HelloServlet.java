package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet",urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //응답메세지 보내보기
        response.setContentType("text/plain"); //header에 들어감
        response.setCharacterEncoding("utf-8");//문자인코딩정보 알려주기 //header에 들어감
        response.getWriter().write("hello"+ username);//http body에 데이터 들어감
    }//서블릿 호출되면 서비스 호출됨
}
