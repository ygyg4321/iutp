package ac.kr.hnu.iutp.aop;

import org.springframework.stereotype.Component;

@Component
public class RecursiveFunction implements Calculater{
    @Override
    public long factorial(int n) {
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
