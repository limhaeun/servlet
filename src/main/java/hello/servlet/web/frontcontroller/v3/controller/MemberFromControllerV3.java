package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Map;

public class MemberFromControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) throws ServletException, IOException {
        return new ModelView("new-form");//뷰 path아니라 논리적 이름 넣기!
    }

}