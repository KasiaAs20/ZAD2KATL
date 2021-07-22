# ZAD2KATL
Klasy złożoności obliczeniowej określają pewne typowe funkcje zależne od ilości danych, które stosowane są wyznaczenia złożoności obliczeniowej danego zadania.
Próbując określić klasę złożoności obliczeniowej dla całego algorytmu lub programu analizujemy jego części wyznaczając ich klasy złożoności obliczeniowej, a następnie korzystając z  operacji wyznaczamy ogólną złożoność.
Złożoność obliczeniową określamy jako funkcję danych wejściowych algorytmu.
Nie trzeba zliczać wszystkich operacji wykonywanych przez algorytm. Wystarczy zliczać operacje dominujące czyli te, które proporcjonalnie pokrywają całą pracę algorytmu.
Zbiór operacji dominujących danego algorytmu to zbiór takich operacji, których liczba jest proporcjonalna do liczby wszystkich operacji wykonanych przez cały algorytm.
Istnieje kilka metod, aby rozwiązać 2 problem przy  użyciu algorytmów  brute-force, sortowanie i haszowanie.
## Użycie Brute-Force
Naiwnym rozwiązaniem jest rozważenie każdej pary w podanej tablicy i zwrócenie jej , jeśli żądana suma jest znaleziona.Złożoność czasowa powyższego rozwiązania wynosi O(n^2) i nie wymaga żadnego dodatkowego miejsca, gdzie n jest rozmiarem wejścia.
## Użycie sortowania
Idea sortowania danej tablicy w porządku rosnącym i wyszukiwania poprzez użycie dwóch indeksów (niskiego i wysokiego), które początkowo wskazują na dwa punkty końcowe tablicy.
Następuje redukcja przestrzeni wyszukiwania arr[low...high]przy każdym powtórzeniu pętli porównywana jest suma elementów obecnych na indeksach low i high z pożądaną sumą.Następuje zwiększenie indeksu low jeśli suma jest mniejsza niż oczekiwana suma,w przeciwnym wypadku,zmniejszenie indeksu high jeśli suma jest większa niż pożądana suma.Jeśli para jest znaleziona program zwraca ją.
Złożoność czasowa powyższego rozwiązania wynosi O(n.log(n)) i nie wymaga dodatkowej przestrzeni.
## Użycie Hashingu
Możemy użyć tablicy haszującej, aby rozwiązać ten problem w czasie liniowym.Idea polega na wstawieniu każdego elementu arr[i]do mapy.Sprawdzamy również czy różnica(arr[i],sum-arr[i]) już istnieje w mapie czy nie.Jeśli różnica jest obecna wcześniej, wypisujemy tę parę i ją zwracamy.Złożoność czasowa powyższego rozwiązania jest O(n) i wymaga O(n) dodatkowej przestrzeni, gdzie n jest rozmiarem wejścia.
# OPIS DZIAŁANIA ZADANIA
Rozszerzyłam funkcjonalność programu o możliwość znalezienia par liczb sumujących się nie tylko do 13, ale i do dowolnej sumy.
Nie można użyć metody hashing map ,ponieważ występują duplikaty kluczy(w tym przypadku 6,6) i nie da się mapy posortować.Dlatego został wybrany algorytm z sortowaniem(program FindPairTwoSum.java)Został też dołączony program z mapą hashingu(ArrayPairSumHashMap.java).
