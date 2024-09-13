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
        System.out.println("Pierwsze " + sitoEratostelesa(200));
    }

    //DO KARTKÓWKI
    static ArrayList<Integer> sitoEratostelesa(int liczba){
        //lista z wartościami logicznymi
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 2; i < liczba; i++) {
            logiczne.add(true);
        }
        //wykreślanie wielokrotności

        for (int i = 0; i < liczba; i++) {
            if (logiczne.get(i).equals(true)){
                //wykreślanie/zmiana na false
                for (int k = i*2; k<liczba; k=k+i){
                    logiczne.set(k, false);
            }
            }
        }
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for (int i = 0; i <logiczne.size(); i++){
            if(logiczne.get(i).equals(true)){
                pierwsze.add(i);
            }
        }
        return pierwsze;
    }
}
