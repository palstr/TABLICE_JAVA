import java.util.*;

public class Main {
    public static void main(String[] args) {
        //tablica
        /*
         musi mieć zdefiniowany, NIEZMIENNY rozmiar.
         Przechowuje typy proste i złożone.
        */

        //kolekcja
        /*
         może przechowywać tylko typy złożone, np. Integer
         nie musi mieć zdefiniowanego rozmiaru
         rozmiar może się zmieniać w trakcie


         typy interfejsów:
         List -> ArrayList, LinkedList
         Set -> HashSet
         Map

        lista:
        indeksowana, uporządkowana, możliwość powtórek

        zbiór: (zazwyczaj)
        nieindeksowany, nieuporządkowane, elementy unikatowe
        */

        Gra gra1= new Gra();
        gra1.zagraj();
    }

}
