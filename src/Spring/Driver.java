package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/spring.xml");
        Car car1 = context.getBean("car",Car.class);
        Car car2 = context.getBean("car",Car.class);
        Car car3 = context.getBean("car",Car.class);

        System.out.println(car1.getName());
        System.out.println(car2.getName());
        System.out.println(car3.getName());

        System.out.println(car1.getTireBrand());
        car1.setName("바보");
        System.out.println(car1.getName());
        System.out.println(car2.getName());
        System.out.println(car3.getName());

        String x = new String("바보"); // 001 객체의 값은 바보일뿐
        String y = new String("바보"); // 003 객체의 값은 바보 일뿐

        String z = "멍청이"; // z -> 002
        String u = "멍청이"; // u -> 002
        
    }
}
