import java.security.SecureRandom;
import java.util.Set;
import java.util.stream.Collectors;

class Przyklad5{
    public Set<Integer> getRandomSixNumbers() {
        SecureRandom random = new SecureRandom();
        return random.ints(6, 1, 50)
                .boxed()
                .collect(Collectors.toSet());
    }
}
