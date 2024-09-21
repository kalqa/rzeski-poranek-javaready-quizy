import java.util.HashSet;
import java.util.Set;

public class ProductCategories {

    public static void main(String[] args) {
        Set<String> categories = new HashSet<>();
        categories.add("Elektronika");
        categories.add("Dom i Ogród");
        categories.add("Elektronika");
        categories.add("Zdrowie");
        System.out.println("Kategorie produktów:");
        for (String category : categories) {
            System.out.println(category);
        }
        if (categories.contains("Elektronika")) {
            System.out.println("Kategoria Elektronika jest dostępna.");
        }
    }
}
