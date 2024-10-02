import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class rar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        System.out.println("Wybierz operacje: \n 1: Dodaj \n 2: Usuń \n 3: Wyświetl ");
//        ArrayList<String> list = new ArrayList<>();
//
//        loop:
//        while(true){
//            displayManu();
//            int userChoice = sc.nextInt();
//            switch(userChoice){
//                case 1:
//                    System.out.println("Podaj element: ");
//                    sc.nextLine();
//                    list.add(sc.nextLine());
//                    System.out.println("Element został dodany");
//                    break ;
//                case 2:
//                    System.out.println("Podaj element do usunięcia: ");
//                    sc.nextLine();
//                    String elementToRemove = sc.nextLine();
//                        if(list.contains(elementToRemove)) {
//                            list.remove((elementToRemove));
//                            System.out.println("element został usunięty");
//                        } else {
//                            System.out.println("Taki element nie znajduje w liscie");
//                        }
//                        break;
//                case 3:
//                    System.out.println("Twoja lista: \n"  + list);
//                    break;
//                case 4:
//                    System.out.println("Do zobaczenia");
//                    break loop;
//                default:
//                    System.out.println("Nieprawidłowy wybór");
//                    break;
//            }
//        }
//
        System.out.println("Podaj numer miesiąca: ");
        int monthNumber = sc.nextInt();
        checkSeason(monthNumber);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj 4 liczby całkowite: ");

        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        int highestNum = numbers.get(0);
        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i) > highestNum){
                highestNum = numbers.get(i);
            }
        }
        System.out.println("Maksymalna wartość w tablicy wynosi: " + highestNum);

        System.out.println("Podaj pierwsze imie: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj drugie imię: ");
        String secondName = sc.nextLine();

        if(firstName.equals(secondName))
            System.out.println("Imiona są indentyczneS");
         else if (firstName.length() == secondName.length())
            System.out.println("Imiona są takiej samej długości");
         else System.out.println("Imiona są róznej długości");
    }

    private static void checkSeason(int monthNumber) {
        switch (monthNumber){
            case 3, 4, 5 -> System.out.println("Wiosna");
            case 6, 7, 8 -> System.out.println("Lato");
            case 9, 10, 11 -> System.out.println("Jesień");
            case 12, 1, 2 -> System.out.println("Zima");

        }
    }
}

//Zad 1.  Użyj klawiatury, aby wprowadzić liczbę odpowiadającą dniu tygodnia. Następnie, zależnie od wprowadzonej liczby, wyświetl nazwę dnia tygodnia: „Poniedziałek”, „Wtorek”, „Środa”, „Czwartek”, „Piątek”, „Sobota”, „Niedziela”, a jeśli wprowadzisz liczbę większą niż 7 bądź mniejszą niż 1, wyświetl „Nie ma takiego dnia tygodnia”.
//Zad 2. Wprowadź za pomocą klawiatury trzy liczby: a, b i c (długości boków proponowanego trójkąta). Ustal, czy można zbudować taki trójkąt. Wyświetl wynik w następujący sposób:
//        "Da się zbudować trójkąt." – jeśli trójkąt o takich bokach może być zbudowany.
//        "Nie da się zbudować trójkąta." – jeśli trójkąt o takich bokach nie może być zbudowany.
//        Zad 3. Napisz program, który prosi użytkownika o podanie liczby, aż do momentu gdy suma podanych liczb będzie >= 100, po wyjściu z pętli program wypisuje zawartość zmiennej 'sum' przechowującej sumę podanych liczb.
//Zad 4. Napisz program, który wyświetli sumę wszystkich dzielników liczby całkowitej podanej przez użytkownika.
//        Zad 5. Napisz program, który sumuje wszystkie cyfry w liczbie podanej przez użytkownika.
//Zad 6. Stwórz program, który wypełni tablicę (liczba elementów ma się mieścić w przedziale <2,20>) liczbami całkowitymi podanymi przez użytkownika. Do wypełnienia oraz wypisania elementów tablicy użyj przez siebie zdefiniowanych metod statycznych.
//Zad 7. Podaj 10 liczb całkowitych i stwórz z nich listę, ale do listy wpisz tylko niepowtarzające się elementy, listę posortuj i wyświetl.
//
//        przykład 3, 5, 6, 4, 4, 2, 3, 7, 4, 2
//
//unikalne elementy posortowane [2,3,4,5,6,7]
//
//
//
//Zad 1. Napisz program, który pobiera od użytkownika liczbę całkowitą 'n' i wyznacza n-ty wyraz ciągu Fibonnaciego.
//Zad 2. Napisz program, który wyświetla łańcuch znaków ze spacją pomiędzy znakami, np. "ma nosa" -> "m a  n o s a" (podpowiedź: sprawdź funkcję charAt())
//Zad 3. Napisz program, który pobiera od użytkownika liczbę całkowitą 'n' i wyświetla w konsoli:
//        1
//        22
//        333
//        ...
//nnnn...n
//Zad 4. Napisz program, który wypełni tablicę i wyświetli tablicę z 'n' Punktami podanymi przez użytkownika. Do wypełnienia tablicy punktami oraz wyświetlenia elementów tablicy użyj własnych metod statycznych. Do metod przekaż jako argument tablicę z punktami.
//Zad 5. Napisz program, który wyświetli liczbę wystąpień elementu w tablicy. Tablica oraz szukany element zostaje podany na początku działania programu. Do sprawdzania użyj statycznej metody, której argumentami będą tablica oraz szukany element.
//        Zad 6. Napisz program, który umieszcza nieparzyste elementy tablicy przed parzystymi.
//
//Zad 7. Stwórz program z następującymi opcjami:
//Dodaj
//        Usuń
//Wyświetl
//        Zakończ
//Program potrafi dodawać elementy do ArrayListy, usuwać z niej elementy i ją wyświetlać. Na początku działania programu należy stworzyć pustą ArrayListę. Program działa do momentu, aż użytkownik wybierze 4 opcję. Wtedy na ekranie pojawia się komunikat "Do zobaczenia".
//Zad 8. Napisz program sprawdzający porę roku. Bazując na numerze danego miesiąca program powinien określać i wyświetlać porę roku (zima, wiosna, lato, jesień). Do sprawdzenia pory roku użyj metody statycznej checkSeason() przyjmującej jako argument numer miesiąca.
//Wskazówka: liczby 12, 1 i 2 są miesiącami zimowymi; 3, 4 i 5 wiosennymi itd. Spróbuj napisać program z użyciem instrukcji 'Switch', a następnie instrukcji 'If'
//Zad 9. Napisz program, który pobiera od użytkownika 4 liczby całkowite i wyświetla największą z nich.
//        Zad 10. Napisz program, który pobiera od użytkownika dwa imiona. Jeśli imiona są identyczne, wyświetla komunikat "Imiona są identyczne". Jeśli imiona są różne, ale są takiej samej długości program ma wyświetlić komunikat
