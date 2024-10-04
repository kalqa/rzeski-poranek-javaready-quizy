import java.util.*;

public class CollectionExamples {


    public static void main(String[] args) {
        // Zamiast tego:
        // LinkedList<String> owners = new LinkedList<>();
        // Zrób to:
        List<String> owners = new LinkedList<>();
        // Zamiast tego:
        // HashMap<String, String> settings = new HashMap<>();
        // Zrób to:
        Map<String, String> settings = new HashMap<>();
        // Zamiast tego:
        // String result = "Name: " + name + ", Age: " + age;
        // Zrób to:
        String name = "John";
        int age = 30;
        String result = String.format("Name: %s, Age: %d", name, age);
        // Zamiast tego:
        // if (numbers.size() == 0) { }
        // Zrób to:
        List<Integer> numbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        }
        // Zamiast tego:
        // HashSet<String> countries = new HashSet<>();
        // Zrób to:
        Set<String> countries = new HashSet<>();
        // Zamiast tego:
        // List<String> names = new ArrayList<>();
        // names.add("John");
        // names.add("Jane");
        // Zrób to:
        List<String> names = Collections.unmodifiableList(new ArrayList<>());
        // Zamiast tego:
        // TreeMap<String, Integer> itemCounts = new TreeMap<>();
        // Zrób to:
        Map<String, Integer> itemCounts = new TreeMap<>();
        // Zamiast tego:
        // List<String> elements = new ArrayList<>();
        // elements.add("A");
        // elements.add("B");
        // elements.add("C");
        // Zrób to:
        List<String> elements = Arrays.asList("A", "B", "C");
        // Zamiast tego:
        // Set<String> uniqueValues = new HashSet<>();
        // for (String value : list) {
        //     uniqueValues.add(value);
        // }
        // Zrób to:
        List<String> list = Arrays.asList("Apple", "Banana", "Apple");
        Set<String> uniqueValues = new HashSet<>(list);
        // Zamiast tego:
        // ArrayList<String> fruits = new ArrayList<>();
        // Zrób to:
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Owners: " + owners);
        System.out.println("Settings: " + settings);
        System.out.println("Formatted String: " + result);
        System.out.println("Countries: " + countries);
        System.out.println("Immutable Names List: " + names);
        System.out.println("Item Counts: " + itemCounts);
        System.out.println("Elements: " + elements);
        System.out.println("Unique Values: " + uniqueValues);
        System.out.println("Fruits: " + fruits);
    }
}

