package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/spring.xml");
        Car car = context.getBean("car",Car.class);

        System.out.println(car.getTireBrand());
    }
}
