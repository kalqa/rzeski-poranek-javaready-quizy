import org.springframework.beans.factory
        .annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService3 {
    private MyRepository repository;

    @Autowired
    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
}

