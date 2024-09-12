import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //tablica
        /*
         musi mieć zdefiniowany, NIEZMIENNY rozmiar.
         Przechowuje typy proste i złożone.
        */

        int [] tablicaLiczbLosowych = new int[6];

        // losujemy wartości 1-100

        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100);
        }
        //wypisywanie tablicy na ekranie

        for (int element:tablicaLiczbLosowych) {
            System.out.print(element + ", ");
        }

        System.out.println(" ");

        //wypelnianie kolekcji wartosciami losowymi
        /*
         może przechowywać tylko typy złożone, np. Integer
         nie musi mieć zdefiniowanego rozmiaru
         rozmiar może się zmieniać w trakcie

         typy interfejsów:
         List -> ArrayList, LinkedList
         Set -> HashSet
         Map
        */

        List<Integer> listaLiczbLosowych = new ArrayList<>();
        //jeśli byłoby na początku ArrayList, nie można by było zmienić

        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*10);
            listaLiczbLosowych.add(liczba);
        }
        System.out.println("Wylosowana lista");
        for (Integer element:listaLiczbLosowych) {
            System.out.print(element + ", ");
        }
        System.out.println(tablicaLiczbLosowych);

        //losowanie do listy bez powtórzeń

        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*100+1);

            while(listaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }

        System.out.println(listaLosowychBezPowtorzen);

        /*
        lista:
        indeksowana, uporządkowana, możliwość powtórek

        zbiór: (zazwyczaj)
        nieindeksowany, nieuporządkowane, elementy unikatowe
        */

        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();

        while (zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Zbiór liczb losowych: ");
        System.out.println(zbiorLiczbLosowych);
    }
}