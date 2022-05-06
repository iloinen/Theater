package main;

public class Main {

    public static void main(String[] args) {
        Actor[] actors = {
                new Actor("Szép Emese", 40, RoleType.ADULT_ANY),
                new Actor("Trab Antal", 20, RoleType.ADULT_MALE),
                new Actor("Am Erika", 10, RoleType.CHILD),
                new Actor("Érték Elek", 60, RoleType.OLD),
                new Actor("Jó Áron", 40, RoleType.ADULT_ANY),
                new Actor("Mangal Ica", 20, RoleType.ADULT_FEMALE),
                new Actor("Mond Tamás", 10, RoleType.YOUNG)
        };

        Troupe troupe = new Troupe(actors);

        Play play = new Play("Szerző", "Cím", 1);

        Role[] roles = {
                new Role(play, "A Nő", RoleType.ADULT_FEMALE),
                new Role(play, "A Férfi", RoleType.ADULT_MALE),
                new Role(play, "A Gyerek", RoleType.CHILD),
                new Role(play, "A Láthatatlan Kéz", RoleType.ADULT_ANY)
        };

        play.setRoles(roles);

        Performance performance = new Performance(troupe, play);

        performance.showMustGoOn();
    }

}
