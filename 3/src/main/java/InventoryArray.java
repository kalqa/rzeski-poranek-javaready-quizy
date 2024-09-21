public class InventoryArray {

    public static void main(String[] args) {
        String[] inventory = {"Laptop", "Smartfon", "Klawiatura", "Mysz", "Monitor"};
        System.out.println("Produkty w magazynie:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Produkt " + (i + 1) + ": " + inventory[i]);
        }
        // Próba dodania nowego produktu (tablica ma stały rozmiar, więc to nie zadziała)
        // inventory[5] = "Kamera"; // To spowodowałoby błąd
    }
}
