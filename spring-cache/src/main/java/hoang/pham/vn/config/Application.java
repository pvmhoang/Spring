package hoang.pham.vn.config;

import hoang.pham.vn.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        hoang.pham.vn.User userOne = userService.getUser(2);
        System.out.println(userOne);
        //userService.removeUser(2);
        User userTwo = userService.getUser(2);
        System.out.println(userTwo);
    }
}
