package ac.kr.hnu.iutp;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Lombok: Boilerplate Code(상용구 코드)를 없애준다.
//@Data: Default 생성자, getters & setters, hashcode(), equals(), toString()
@Data
public class Restaurant {
    private String name;
    private String address;
    private String phone;

    private Chef chef;

    //

}
