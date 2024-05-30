package ac.kr.hnu.iutp;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class RestaurantApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");

//        Restaurant restaurant = new Restaurant();
//        restaurant.setName("miso restaurant");
//        restaurant.setAddress("대전광역시 동구");
//        restaurant.setPhone("042-222-3333");
//        Chef chef = new Chef();
//        chef.setName("백종원");
//        chef.setAge(57);
//        restaurant.setChef(chef);
        // 로그를 보고 싶을 때는 System.out.println()을 사용하면 절대로 안된다.
        // log4j나 log4j2, slf4j와 같은 라이브러리를 사용해서 로그를 찍어야 함

//        System.out.println(restaurant);
        // log의 5가지 레벨(level)
        // trace, debug, info, warning, error
        // 출력 세팅은 appliation.properties에서 한다.

        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        log.info("restaurant: {}", restaurant);

    }
}
