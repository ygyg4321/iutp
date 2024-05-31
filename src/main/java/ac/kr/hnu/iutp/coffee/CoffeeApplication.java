package ac.kr.hnu.iutp.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// @ImportResource("classpath:coffee-context.xml")
public class CoffeeApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CoffeeApplication.class, args);
        Cafe cafe = context.getBean("cafe", Cafe.class);
        Coffee aa = cafe.getOrder(5000,"아아");
        System.out.println(aa+ "를 마신다.");
    }
}
