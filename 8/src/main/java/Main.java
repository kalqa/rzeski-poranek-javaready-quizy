import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

    }

    public void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public void printAllPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }
    }

    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;  // Element nie znaleziony
    }

    public int getFirstElement(int[] array) {
        return array[0];
    }

    List<String> cart = new ArrayList<>();

    public void addToCart(String product) {
        cart.add(product);  // O(1)
    }

    public boolean productExists(String product) {
        for (String p : cart) {
            if (p.equals(product)) {
                return true;  // O(n)
            }
        }
        return false;
    }

}