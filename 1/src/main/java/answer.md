Poprawne odpowiedzi:
1. Co robi poniższa linia kodu w metodzie main?
System.out.println("Wylosowane liczby: " + randomNumbers);
   Poprawna odpowiedź: B) Wyświetla wylosowane liczby na ekranie.

Wyjaśnienie:
Metoda System.out.println() służy do wyświetlenia informacji w konsoli. 
W tym przypadku, wyświetla komunikat "Wylosowane liczby: " połączony z wynikiem losowania liczb, które są przechowywane w zmiennej randomNumbers.

2. Zmień wartość NUMBERS_TO_GENERATE na 10. Co się stanie?
   Poprawna odpowiedź: A) Program wygeneruje 10 unikalnych liczb.

Wyjaśnienie:
Zmieniając wartość NUMBERS_TO_GENERATE na 10, program wygeneruje 10 losowych liczb z zakresu określonego przez NUMBER_ORIGIN i NUMBER_BOUND. 
Ponieważ metoda boxed().collect(Collectors.toSet()) tworzy kolekcję typu Set, liczby będą unikalne, ponieważ Set nie pozwala na duplikaty.

3. Zamiast używać klasy Set, zmień typ zwracany przez metodę getRandomSixNumbers() na List<Integer>. Co się stanie?
   Poprawna odpowiedź: A) Liczby będą w takiej samej formie, ale będą mogły się powtarzać.

Wyjaśnienie:
Jeśli zmienisz typ zwracany na List<Integer> i zamienisz .collect(Collectors.toSet()) na .collect(Collectors.toList()), program będzie nadal działał, ale teraz kolekcja będzie mogła zawierać powtarzające się liczby. 
W przeciwieństwie do Set, lista (List) dopuszcza duplikaty, więc możliwe jest, że niektóre liczby będą występować więcej niż raz.

4. Zmień wartości NUMBER_ORIGIN na 10 i NUMBER_BOUND na 20. Co się stanie?
   Poprawna odpowiedź: B) Program wygeneruje liczby od 10 do 19.

Wyjaśnienie:
Metoda random.ints(NUMBERS_TO_GENERATE, NUMBER_ORIGIN, NUMBER_BOUND) generuje liczby z przedziału zamkniętego dla dolnej granicy (włącznie) i otwartego dla górnej granicy (wyłącznie). 
Po zmianie NUMBER_ORIGIN na 10 i NUMBER_BOUND na 20, liczby będą generowane w przedziale od 10 do 19 włącznie.
