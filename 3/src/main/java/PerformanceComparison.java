import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerformanceComparison {

    public static void main(String[] args) {
        // Tworzenie dużej listy produktów
        List<String> productListArray = new ArrayList<>();
        List<String> productListLinked = new LinkedList<>();
        Set<String> productSet = new HashSet<>();

        // Dodawanie produktów do ArrayList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            productListArray.add("Produkt " + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Czas dodawania do ArrayList: " + (endTime - startTime) + " ms");

        // Dodawanie produktów do LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            productListLinked.add("Produkt " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Czas dodawania do LinkedList: " + (endTime - startTime) + " ms");

        // Dodawanie produktów do HashSet
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            productSet.add("Produkt " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Czas dodawania do HashSet: " + (endTime - startTime) + " ms");

        // Dostęp do elementu z ArrayList
        startTime = System.currentTimeMillis();
        String product = productListArray.get(5000); // Szybki dostęp
        endTime = System.currentTimeMillis();
        System.out.println("Czas dostępu do elementu w ArrayList: " + (endTime - startTime) + " ms");

        // Dostęp do elementu z LinkedList
        startTime = System.currentTimeMillis();
        product = productListLinked.get(5000); // Wolniejszy dostęp
        endTime = System.currentTimeMillis();
        System.out.println("Czas dostępu do elementu w LinkedList: " + (endTime - startTime) + " ms");
    }
}
