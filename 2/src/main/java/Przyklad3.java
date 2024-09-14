public class Przyklad3 {
    public void powitanie(String imie) {
        System.out.println("Cześć, " + imie + "!");
    }

    public static void main(String[] args) {
        Przyklad3 przyklad = new Przyklad3();
        przyklad.powitanie("Ania"); // Wyświetli: Cześć, Ania!
        przyklad.powitanie("Jan");  // Wyświetli: Cześć, Jan!
    }
}
