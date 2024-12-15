import org.springframework.stereotype.Component;

@Component
public class UserController {
    private final UserService5 userService;

    public UserController(UserService5 userService) {
        this.userService = userService;
    }

    public void executeTask() {
        userService.performTask();
    }
}
