import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Task {

    public static void main(String[] args) {
        List<String> orders = Arrays.asList("Zamówienie #1", "Zamówienie #2", "Zamówienie #2");
        Set<String> uniqueOrders = new HashSet<>(orders);
        System.out.println(uniqueOrders);
    }
}
