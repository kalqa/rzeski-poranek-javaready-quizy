public class TimeComplexityExample {


    public static void main(String[] args) {
        // O(1) – Stała operacja
        long start1 = System.currentTimeMillis();
        int x = 1 + 1;
        long end1 = System.currentTimeMillis();
        System.out.println("O(1) operation took: " + (end1 - start1) + " ms");


        // O(n) – Liniowa operacja
        int n = 100000;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int y = i + 1;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("O(n) operation took: " + (end2 - start2) + " ms");


        // O(n^2) – Kwadratowa operacja
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int z = i * j;
            }
        }
        long end3 = System.currentTimeMillis();
        System.out.println("O(n^2) operation took: " + (end3 - start3) + " ms");
    }
}