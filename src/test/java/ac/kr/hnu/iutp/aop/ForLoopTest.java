package ac.kr.hnu.iutp.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
class ForLoopTest {
    // private static final Logger log = LoggerFactory.getLogger(ForLoopTest.class);

    @Test
    void factorial() {
        ForLoop forLoop = new ForLoop();
        long factorial = forLoop.factorial(5);
        System.out.println(factorial);
        log.info("factorial: {}", factorial);
    }

}