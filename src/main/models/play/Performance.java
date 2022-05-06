package main.models.play;

import main.models.troupe.Actor;
import main.models.troupe.Troupe;
import main.models.troupe.TroupeMember;

public class Performance {

    private Troupe troupe;
    private Play play;
    private ActorWithRole[] actorWithRoles;

    public Performance(Troupe troupe, Play play) {
        this.troupe = troupe;
        this.play = play;
        giveRolesToActors();
    }

    public void showMustGoOn() {
        System.out.println("----- PERFORMANCE -----");
        System.out.println(play.getTitle() + " by " + play.getAuthor());
        System.out.println("Actors:");

        for (ActorWithRole actorWithRole : actorWithRoles) {
            System.out.println("\t" + actorWithRole.getRole().getCharacterName()
                    + " - " + actorWithRole.getActor().getName());
        }
    }

    private void giveRolesToActors() {
        actorWithRoles = new ActorWithRole[play.getRoles().length];

        int membersIndex = 0;
        int actorWithRolesIndex = 0;

        for (Role role : play.getRoles()) {
            boolean roleGiven;

            do {
                TroupeMember member = troupe.getMembers()[membersIndex];
                roleGiven = canGiveRole(actorWithRolesIndex, member, role);

                if (membersIndex == troupe.getMembers().length - 1) {
                    membersIndex = 0;
                } else {
                    membersIndex++;
                }
            } while (!roleGiven);

            actorWithRolesIndex++;
        }
    }

    private boolean canGiveRole(int index, TroupeMember member, Role role) {
        if (member instanceof Actor actor) {
            actorWithRoles[index] = new ActorWithRole(actor, role);
            return true;
        }

        return false;
    }

    public Troupe getTroupe() {
        return troupe;
    }

    public void setTroupe(Troupe troupe) {
        this.troupe = troupe;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public ActorWithRole[] getPlayingActors() {
        return actorWithRoles;
    }

    public void setPlayingActors(ActorWithRole[] actorWithRoles) {
        this.actorWithRoles = actorWithRoles;
    }

}
