package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAapter {
    boolean suppports(Object Handler);//컨트롤러 왔을때 핸들러 지원할 수 있는지,,,거르는 역할
    ModelView  handler(HttpServletRequest request, HttpServletResponse response,Object handler)throws ServletException, IOException;//걸러진거 가지고 핸들러 호출
}
