package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class SrpingMemberSaveControllerV1 {
    private MemberRepository mr = MemberRepository.getInstance();

    /*@RequestMapping ("/springmvc/v1/members/save")
    public ModelAndView process(Map<String, String> paramMap){
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age");

        Member m = new Member(username,age);
        mr.save(m);

        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member",m);
        return mv;

    }*/


    @RequestMapping ("/springmvc/v1/members/save")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));


        Member m = new Member(username,age);
        mr.save(m);

        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member",m);
        return mv;

    }
}
