package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemberRepositotoryTest {

    MemberRepository m = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        m.clearStore();
    }//테스트 끝나면 초기화

    @Test
    void save(){
        //given
        Member member = new Member("hello",20);

        //when
        Member savedMember = m.save(member);

        //then
        Member findMember =m.findById(savedMember.getId());
        assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll(){
        //given
        Member m1 = new Member("member1",20);
        Member m2 = new Member("member2",20);

        m.save(m1);
        m.save(m2);

        //when
        List<Member> result  = m.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(m1,m2);
    }
}

