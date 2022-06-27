package hello.servlet.web.springmvc.v4;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/springmvc/v4/members")
public class springMemberControllerV4 {
    private MemberRepository mr = MemberRepository.getInstance();

    //@RequestMapping(value="/new-form", method= RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm(){
        return "new-form";
    }


    //@RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public String members(Model model){

        List<Member> members = mr.findAll();
        model.addAttribute("members",members);
        return "members";
    }

    //@RequestMapping (value="/save", method =  RequestMethod.POST)
    @PostMapping("/save")
    public String save(@RequestParam("username")String username, @RequestParam("age")int age, Model model){
        Member m = new Member(username,age);
        mr.save(m);

        model.addAttribute("member",m);
        return "save-result";
    }

}//get,post구분하지 않았다...
