import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy String:");
        String input1 = scanner.nextLine();
        System.out.println("Podaj drugi String:");
        String input2 = scanner.nextLine();
        System.out.println("Czy hashCode() jest równy? " + (input1.hashCode() == input2.hashCode()));
        System.out.println("Czy System.identityHashCode() jest równy? " +
                (System.identityHashCode(input1) == System.identityHashCode(input2)));

        String s1 = "Java";
        String s2= new String("Java");
        System.out.println(s1 == s2);

        String str1 = "Programowanie";
        String str2 = "Programowanie";
        System.out.println(str1 == str2);
        System.out.println(System.identityHashCode(str1) == System.identityHashCode(str2));


    }
}