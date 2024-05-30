package ac.kr.hnu.iutp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@Slf4j
@SpringBootApplication
//@ImportResource("classpath:root-context.xml")
public class IutpApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IutpApplication.class, args);
        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("Restaurant: {}", restaurant);
        Chef chef = restaurant.getChef();
        Ingredient ingredient = chef.prepare();

        Food food = chef.cook(ingredient);
        log.info("Food: {}", food);
    }
}
