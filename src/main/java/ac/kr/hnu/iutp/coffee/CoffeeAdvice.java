package ac.kr.hnu.iutp.coffee;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j

public class CoffeeAdvice {
    @Before("execution(public Coffee ac.kr.hnu.iutp.coffee.CoffeeMachine.brew(Bean))")
    public void grind(){
        log.info("원두를 갈아줍니다.");
    }
}
