package ac.kr.hnu.iutp.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class CalculaterApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CalculaterApplication.class, args);
        Calculater calculater = context.getBean("forLoop",Calculater.class);
        long factorial = calculater.factorial(10);
        log.info("for Loop: {}", factorial);

        calculater = context.getBean("recursiveFunction",Calculater.class);
        factorial = calculater.factorial(10);
        log.info("Recursive Function: {}", factorial);
    }
}
