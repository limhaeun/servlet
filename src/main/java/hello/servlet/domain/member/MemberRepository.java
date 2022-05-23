package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//동시성 문제가 고려되어있지 않음
//실무에선 ConcurrentHashMap, AtomicLong사용 고려

public class MemberRepository {

    private static Map<Long,Member> store = new HashMap<>();
    private static Long sequence= 0L;

    private static final MemberRepository instance= new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }
    private MemberRepository(){

    }//싱글톤으로만들때 아무나 만들지 못하게 생성자 막아줘야함함

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(),member);
        return member;
    }
    public Member findById(Long id){
        return store.get(id);
    }
    public List<Member> findAll(){
        return new ArrayList<>(store.values());//스토에 있는 모든 값들 꺼내서 새로운 arrayList담아줌 -> store에 있는 거 건들이기 싫어서...Store자체
    }
    public void clearStore(){
        store.clear();
    }
}
