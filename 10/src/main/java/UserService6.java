import org.springframework.context
        .annotation.Scope;
import org.springframework
        .stereotype.Component;

@Component
@Scope("prototype")
public class UserService6 {
    public void performTask() {
        System.out.println("Zadanie wykonane przez " +
                "UserService!");
    }
}
