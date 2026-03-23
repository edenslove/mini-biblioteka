public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka (int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano książkę: " + ksiazka.tytul);
        } else {
            System.out.println("Brak miejsca w bibliotece");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki: ");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].dostepna) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].tytul.equalsIgnoreCase(tytul)) {
                return ksiazki[i];
            }
        }
        return null;

    }

    public int policzDostepneKsiazki() {
        int liczba = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if(ksiazki[i].dostepna) {
                liczba++;
            }
        }
        return liczba;
    }

    public void wypozyczKsiazke (String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka != null) {
            if (ksiazka.dostepna()) {
                ksiazka.wypozycz();
                czytelnik.zwiekszLiczbeWypozyczen();
            } else {
                System.out.println("Ksiażka jest już wypożyczona.");
            }
        } else {
            System.out.println("Nie znaleciono ksiązki.");
        }

    }

    public void zwrocKsiazke (String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

        if (ksiazka !=null) {
            if (!ksiazka.dostepna()) {
                ksiazka.zwroc();
                czytelnik.zmniejszLiczbeWypozyczen();
            } else {
                System.out.println("Ksiażka");
            }
        } else {
            System.out.println("Nie znaleziono ksiażki.");
        }
    }



}
