public class Dzielenie {
    public static void main(String[] args) {
        int licznik = 20;   // licznik
        int mianownik = 5;  // mianownik
        if (mianownik != 0) {
            int wynik = licznik / mianownik;  // dzielenie
            System.out.println("Wynik dzielenia to: " +
                    "" + wynik);
        } else {
            System.out.println("Błąd: nie można dzielić " +
                    "przez zero!");
        }
    }
}
