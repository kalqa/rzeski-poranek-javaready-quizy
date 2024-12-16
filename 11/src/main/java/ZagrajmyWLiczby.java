public class ZagrajmyWLiczby {
    public static void main(String[] args) {
        // Sprawdzanie, czy liczba jest parzysta
        int liczba = 8; // Możesz zmienić tę wartość
        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }
        // Wypisywanie liczb od 1 do 10 za pomocą pętli for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Iterowanie po tablicy imion za pomocą for-each
        String[] imiona = {"Jan", "Anna", "Ola", "Piotr", "Zofia"};
        for (String imie : imiona) {
            System.out.println("Imię: " + imie);
        }
    }
}
