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

        ArrayList<Integer> listaLosowychBezPowtorzen = wylosujLiczby(7);
        LinkedList<Integer> listaLiczZKlawiatury = wczytajLiczby(4);
        ArrayList<Integer> trafione = sprawdzKtorePowtarzajaSie(listaLosowychBezPowtorzen, listaLiczZKlawiatury);

        System.out.println("Liczby wylosowane:");
        wypiszListe(listaLosowychBezPowtorzen);
        System.out.println(" ");
        System.out.println("Liczby wpisane:");
        wypiszListe(listaLiczZKlawiatury);
        System.out.println(" ");
        System.out.println("Liczby trafione:");
        wypiszListe(trafione);

    }

    /**
     * wylosujLiczby - metoda losująca liczby całkowite z zakresu 1-100
     * @param ile - liczba wylosowanych wartości
     * @return lista z wylosowanymi wartościami
     */
    private static ArrayList<Integer> wylosujLiczby(int ile){
        //losowanie do listy bez powtórzeń
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < ile; i++) {
            liczba = (int)(Math.random()*100+1);

            while(listaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }

        return listaLosowychBezPowtorzen;

    }

    private static void wypiszListe(List<Integer>lista){
        //jeśli byłoby na początku ArrayList, nie można by było zmienić

        for (Integer element:lista) {
            System.out.print(element + ", ");
        }
    }

    private static ArrayList<Integer> sprawdzKtorePowtarzajaSie(ArrayList<Integer> listaLosowychBezPowtorzen, LinkedList<Integer> listaLiczbZKlawiatury){

        // trafione, czyli będące we wpisanych i wylosowanych
        ArrayList<Integer> trafione = new ArrayList<>();
        for (Integer element:listaLosowychBezPowtorzen) {
            if (listaLiczbZKlawiatury.contains(element)){
                trafione.add(element);
            }
        }
        return trafione;
    }
    private static LinkedList<Integer> wczytajLiczby(int ile){
        //lista liczb wczytywanych z klawiatury

        Scanner klawiatura = new Scanner(System.in);
        LinkedList<Integer> listaLiczbZKlawiatury = new LinkedList<>();
        System.out.println("Wpisz " + ile + " liczb");
        for (int i = 0; i < ile; i++) {
            int wpisanaLiczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(wpisanaLiczba);
        }
        return listaLiczbZKlawiatury;
    }

}