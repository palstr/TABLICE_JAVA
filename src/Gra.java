import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private ArrayList<Integer> wylosowane;
    private LinkedList<Integer> wpisane;
    private ArrayList<Integer> trafione;

    private void wylosujLiczby(int ile){
        //losowanie do listy bez powtórzeń
        wylosowane = new ArrayList<>();
        int liczba;
        for (int i = 0; i < ile; i++) {
            liczba = (int)(Math.random()*100+1);

            while(wylosowane.contains(liczba)) {
                liczba = (int)(Math.random()*100+1);
            }
            wylosowane.add(liczba);
        }

    }

    private void wypiszListe(List<Integer> lista){
        //jeśli byłoby na początku ArrayList, nie można by było zmienić

        for (Integer element:lista) {
            System.out.print(element + ", ");
        }
    }

    private void sprawdzKtorePowtarzajaSie(){

        // trafione, czyli będące we wpisanych i wylosowanych
        trafione = new ArrayList<>();
        for (Integer element:wylosowane) {
            if (wpisane.contains(element)){
                trafione.add(element);
            }
        }
    }
    private void wczytajLiczby(int ile){
        //lista liczb wczytywanych z klawiatury

        Scanner klawiatura = new Scanner(System.in);
        wpisane = new LinkedList<>();
        System.out.println("Wpisz " + ile + " liczb");
        for (int i = 0; i < ile; i++) {
            int wpisanaLiczba = klawiatura.nextInt();
            wpisane.add(wpisanaLiczba);
        }
    }

    public void zagraj(){
        wylosujLiczby(20);
        wczytajLiczby(5);
        sprawdzKtorePowtarzajaSie();
        System.out.println("Wpisane:");
        wypiszListe(wpisane);
        System.out.println(" ");
        System.out.println("Wylosowane:");
        wypiszListe(wylosowane);
        System.out.println(" ");
        System.out.println("Trafione:");
        wypiszListe(trafione);
    }

}
