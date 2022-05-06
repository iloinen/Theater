package main;

public class Main {

    public static void main(String[] args) {
        String[] actorNames = {"Kis Pista", "Jaj Miez", "Hello Világ", "Szép Emese", "Trab Antal", "Am Erika", "Kis M. Erik"};
        Troupe troupe = new Troupe(actorNames);

        Play play = new Play("Szerző", "Cím", 1, 11);

        Performance performance = new Performance(troupe, play);

        performance.showMustGoOn();
    }

}
