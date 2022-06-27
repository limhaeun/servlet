package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {
    private MemberRepository mr = MemberRepository.getInstance();

    @RequestMapping("/new-form")
    public String newForm(){
        return "new-form";
    }


    @RequestMapping
    public String members(Model model){

        List<Member> members = mr.findAll();
        model.addAttribute("members",members);
        return "members";
    }

    @RequestMapping ("/save")
    public String save(@RequestParam("username")String username, @RequestParam("age")int age, Model model){
        Member m = new Member(username,age);
        mr.save(m);

        model.addAttribute("member",m);
        return "save-result";
    }

}//get,post구분하지 않았다...