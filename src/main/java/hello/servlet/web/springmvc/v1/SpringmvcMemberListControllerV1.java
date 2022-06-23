package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SpringmvcMemberListControllerV1 {

    private MemberRepository mr = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process(){

        List<Member> members = mr.findAll();

        ModelAndView mv = new ModelAndView("members");
        mv.addObject("member",members);
        return mv;

    }
}
