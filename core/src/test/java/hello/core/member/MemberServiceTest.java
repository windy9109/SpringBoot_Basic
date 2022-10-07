package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {




    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    @Test
    void join(){
        //given(머리: 이런 환경에서)
            Member member = new Member(1L, "memberA", Grade.VIP);

        //when(가슴: 실행했을때)
            memberService.join(member); //저장후
            Member findMember = memberService.fingMember(1L); //아이디찾기

        //then(배: 이런결과가 나옴) -> 검증
        Assertions.assertThat(member).isEqualTo(findMember);
        //검증한다. member의 객체와 findMember객체는 같은가?
        //성공시 run할경우 녹색불



    }

}
