import java.util.*;

class Code {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        List<String> unmodifiableNames = Collections.unmodifiableList(names);
        // Próba modyfikacji tej listy spowoduje błąd
        unmodifiableNames.add("Jack"); // Wyrzuci UnsupportedOperationException


        Map<String, Integer> itemCounts = new TreeMap<>();
        itemCounts.put("Banana", 10);
        itemCounts.put("Apple", 20);
        itemCounts.put("Orange", 15);
        // Klucze będą posortowane alfabetycznie
        System.out.println(itemCounts); // {Apple=20, Banana=10, Orange=15}

        Set<String> countries = new HashSet<>();
        countries.add("Poland");
        countries.add("Germany");
        countries.add("Poland"); // Duplikaty są ignorowane
        System.out.println(countries); // [Poland, Germany]



        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits); // [Apple, Banana]

    }

}
