package ac.kr.hnu.iutp.coffee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EspressoMachine implements CoffeeMachine {
    @Override
    public Coffee brew(Bean bean) {
        log.info("bean: {}", bean);
        log.info("원두를 가지고 에스프레소를 만듭니다.");
        return new Coffee();
    }
}
