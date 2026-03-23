public class Main {
    public static void main(String[] args) {
        Ksiazka harryPotter =
                new Ksiazka("Harry Potter", "J.K Rowling", 300, true);

        Ksiazka sezon =
                new Ksiazka("Sezon", "Rafał Wojaczek", 120, false
                );

        Ksiazka breastandeggs =
                new Ksiazka("Breasts and Eggs", "Mieko Kawakami", 200, true);

        //harryPotter.wypiszInfo();
        //harryPotter.wypozycz();
        //harryPotter.wypozycz();
        //harryPotter.zwroc();

        //sezon.wypiszInfo();
        //sezon.wypozycz();

        //breastandeggs.wypiszInfo();
        //breastandeggs.zwroc();
        //breastandeggs.wypozycz();

        Czytelnik milena =
                new Czytelnik("Milena", "Pham", 3619, 2);

        Czytelnik adrian =
                new Czytelnik("Adrian", "Zandberg", 8902, 5);


        //milena.wypiszDane();
        //milena.zmniejszLiczbeWypozyczen();
        //milena.zmniejszLiczbeWypozyczen();
        //milena.zmniejszLiczbeWypozyczen();
        //milena.wypiszDane();

        //adrian.wypiszDane();
        //adrian.zwiekszLiczbeWypozyczen();
        //adrian.wypiszDane();


        Biblioteka biblioteka = new Biblioteka(3);

        biblioteka.dodajKsiazke(harryPotter);
        biblioteka.dodajKsiazke(sezon);
        biblioteka.dodajKsiazke(breastandeggs);

        biblioteka.wypiszDostepneKsiazki();

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Sezon");
        if (znaleziona != null) {
            System.out.println("Znaleziono książkę:");
            znaleziona.wypiszInfo();
        } else {
            System.out.println("Nie znaleziono książki.");
        }

        System.out.println("Liczba dostępnych książek: " + biblioteka.policzDostepneKsiazki());


    }
    }

