import org.springframework.stereotype.Component;

@Component
public class MyService2 {
    private final MyRepository repository;

    public MyService2(MyRepository repository) {
        this.repository = repository;
    }

}
