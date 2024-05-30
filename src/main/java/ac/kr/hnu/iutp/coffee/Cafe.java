package ac.kr.hnu.iutp.coffee;


import java.util.Arrays;
import java.util.List;

import static org.springframework.context.support.BeanDefinitionDslKt.beans;

public class Cafe {
    private CoffeeMachine machine;
    private Barista barista;
    private List<Bean> beans = Arrays.asList(
            new Bean(), //0
            new Bean(), //1
            new Bean(), //2
            new Bean(), //3
            new Bean()  //4
    );

    public Cafe(CoffeeMachine machine) {
        this.machine = machine;
    }

    public void setBarista (Barista barista) {
        this.barista = barista;
    }

    public Coffee getOrder(int money,String menu){
        Coffee coffee = machine.brew(beans.get(0));
        return coffee;
    }


}
