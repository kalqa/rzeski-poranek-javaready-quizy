class Main7 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);  // true - ten sam obiekt w String Pool
        System.out.println(s1 == s3);  // false - s3 to nowy obiekt w pamięci
        System.out.println(s1.equals(s3));  // true - zawartość jest identyczna

        String str1 = "Hello";
        String str2= new String("Hello");
        System.out.println(str1.hashCode());  // 69609650 - identyczny, bo zawartość jest ta sama
        System.out.println(str2.hashCode());  // 69609650 - to samo, bo hashCode bazuje na zawartości
        System.out.println(System.identityHashCode(str1));  // np. 366712642 - różne, bo obiekty są inne
        System.out.println(System.identityHashCode(str2));  // np. 1829164700

    }

}