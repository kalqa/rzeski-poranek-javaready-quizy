class Main9 {

    public static void main(String[] args) {
        int licznik = 10;
        int mianownik = 0;
        if (mianownik != 0) {
            int wynik = licznik / mianownik;
            System.out.println("Wynik to: " + wynik);
        } else {
            System.out.println("Błąd: nie można dzielić " +
                    "przez zero!");
        }
    }

}