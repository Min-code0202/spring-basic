package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberReository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    // 원래는 오류가 나지 않고 빈에 자동 등록된 곳에 수동 등록한 빈이 오버라이딩 됐으나
    // 최근엔 오류가 나도록 수정 -> 그래서 테스트 코드 실행해보면
    // 구버전 : 에러 없이 작동, 로그에 오버라이딩 했다고 표시됨
    // 최신 버전 : 에러 발생함
//    @Bean(name="memoryMemberRepository")
//    MemberRepository memoryMemberRepository() {
//        return new MemoryMemberReository();
//    }
}
