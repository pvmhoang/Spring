package hoang.pham.vn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = context.getBean(UserService.class);
        User userOne = userService.getUser(1);
        System.out.println(userOne);
        User userTwo = userService.getUser(1);
        System.out.println(userTwo);
        System.out.println(userTwo);
        System.out.println(userTwo);
        System.out.println(userTwo);
    }
}
