import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Smartfon");
        cart.add("Mysz");
        System.out.println("Koszyk klienta:");
        for (String item : cart) {
            System.out.println(item);
        }
        cart.remove("Mysz");
        System.out.println("Koszyk po usunięciu Mysz:");
        cart.add("Klawiatura");
        System.out.println("Zaktualizowany koszyk: " + cart);
    }
}
