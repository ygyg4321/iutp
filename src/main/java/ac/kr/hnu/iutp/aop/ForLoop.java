package ac.kr.hnu.iutp.aop;

import org.springframework.stereotype.Component;

@Component
public class ForLoop implements Calculater{

    @Override
    public long factorial(int n) {
        // long start = System.currentTimeMillis();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // long end = System.currentTimeMillis();
        return fact;
    }
}
