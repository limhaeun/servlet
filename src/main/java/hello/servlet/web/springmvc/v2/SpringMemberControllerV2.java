package hello.servlet.web.springmvc.v2;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/springmvc/v2/members")//조합
public class SpringMemberControllerV2 {

    private MemberRepository mr = MemberRepository.getInstance();

    @RequestMapping("/new-form")
    public ModelAndView newForm(){
        return new ModelAndView("new-form");
    }


    @RequestMapping
    public ModelAndView members(){

        List<Member> members = mr.findAll();

        ModelAndView mv = new ModelAndView("members");
        mv.addObject("member",members);
        return mv;
    }

    @RequestMapping ("/save")
    public ModelAndView save(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));


        Member m = new Member(username,age);
        mr.save(m);

        ModelAndView mv = new ModelAndView("save-result");
        mv.addObject("member",m);
        return mv;
    }

}
