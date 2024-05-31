package ac.kr.hnu.iutp.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class CalculaterAdvice {
    @Around("execution(* ac..*.factorial(..))")
    public Object calculate(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        Object proceed = joinPoint.proceed();// 우리가 원하는 factorial()을 호출해 주는 것.
        long end = System.nanoTime();
        log.info("걸린 시간: {} ms", end - start);
        return proceed;
    }
}
