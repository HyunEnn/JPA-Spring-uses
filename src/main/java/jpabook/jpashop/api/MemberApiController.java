package jpabook.jpashop.api;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.service.MemberService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    public CreateMemberResponse saveMemberV1(@RequestBody @Valid Member member) {
        Long id = memberService.join(member);
    }

    @Data
    static class CreateMemberResponse {
        private Long id;
    }
}
