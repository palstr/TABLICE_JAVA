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
            tablicaLiczbLosowych[i] = (int)(Math.random()*100+1);
        }
        //wypisywanie tablicy na ekranie

        for (int element:tablicaLiczbLosowych) {
            System.out.print(element + ", ");
        }

    }
}