import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation
        .AnnotationConfigApplicationContext;

public class Main106 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService6 userService1 = context.getBean(UserService6.class);
        UserService6 userService2 = context.getBean(UserService6.class);
        System.out.println("Czy instancje są różne? " +
                (userService1 != userService2));
    }
}
