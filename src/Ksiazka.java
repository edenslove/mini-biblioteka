public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka (String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron =  liczbaStron;
        this.dostepna =  dostepna;

    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba Stron: " + this.liczbaStron);
        System.out.println("Dostępność: " + this.dostepna);
    }


    public void wypozycz() {
        if (this.dostepna) {
            this.dostepna = false;
            System.out.println("Super! Ksiązka została wypożyczona!");
        } else {
            System.out.println("Ksiązka jest niedostępna :(");
        }
    }

    public void zwroc(){
        if (!this.dostepna) {
            this.dostepna = true;
            System.out.println("Zwrocono ksiażke: " + this.tytul);
        } else {
            System.out.println ("Ksiazka " + this.tytul + " jest dostępna");
        }
    }
}











