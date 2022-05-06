package main;

import main.models.enums.PlayGenre;
import main.models.enums.PlayLevel;
import main.models.enums.RoleType;
import main.models.play.Performance;
import main.models.play.Play;
import main.models.play.Role;
import main.models.troupe.*;

public class Main {

    public static void main(String[] args) {
        Troupe troupe = createTroupe();
        Play play = createPlay();

        Performance performance = new Performance(troupe, play);

        performance.showMustGoOn();
    }

    private static Troupe createTroupe() {
        TroupeMember[] members = {
                new Director("Es Ernő", 100, 10, 1),
                new PropMan("Farkas Piroska", 50, new String[]{"mérgezett piros alma"}),
                new Actor("Szép Emese", 40, RoleType.ADULT_ANY),
                new Actor("Trab Antal", 20, RoleType.ADULT_MALE),
                new Actor("Am Erika", 10, RoleType.CHILD),
                new Actor("Érték Elek", 60, RoleType.OLD),
                new Actor("Jó Áron", 40, RoleType.ADULT_ANY),
                new Actor("Mangal Ica", 20, RoleType.ADULT_FEMALE),
                new Actor("Mond Tamás", 10, RoleType.YOUNG)
        };

        return new Troupe("Council of Six", members);
    }

    private static Play createPlay() {
        Play play = new Play("Szerző", "Cím", 1, PlayLevel.EASY, PlayGenre.COMEDY);

        Role[] roles = {
                new Role(play, "A Nő", RoleType.ADULT_FEMALE),
                new Role(play, "A Férfi", RoleType.ADULT_MALE),
                new Role(play, "A Gyerek", RoleType.CHILD),
                new Role(play, "A Láthatatlan Kéz", RoleType.ADULT_ANY)
        };

        play.setRoles(roles);

        return play;
    }

}
