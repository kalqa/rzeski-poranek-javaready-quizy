public class Przyklad1 {

    public int dodajLiczby(int liczba1, int liczba2) {
        return liczba1 + liczba2;
    }

    public static void main(String[] args) {
        Przyklad1 przyklad = new Przyklad1();
        int wynik = przyklad.dodajLiczby(5, 10);
        System.out.println("Suma: " + wynik);
    }
}
