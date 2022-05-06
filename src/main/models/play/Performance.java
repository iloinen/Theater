package main.models.play;

import main.models.troupe.Director;
import main.models.troupe.Troupe;
import main.models.troupe.TroupeMember;

public class Performance {

    private Troupe troupe;
    private Play play;
    private ActorWithRole[] actorWithRoles;
    private Director director;

    private boolean wasSuccess;

    public Performance(Troupe troupe, Play play) {
        this.troupe = troupe;
        this.play = play;
    }

    public void showMustGoOn() {
        areYouPrepared();

        printDirector(true);

        printPerformance();

        setWasSuccess(Math.random() > 0.5);
        changeDirectorFields(director);

        printDirector(false);
    }

    private void areYouPrepared() {
        director = findDirector();
        actorWithRoles = director.giveRolesToActors(troupe, play);
    }

    private Director findDirector() {
        for (TroupeMember member : troupe.getMembers()) {
            if (member instanceof Director director) {
                return director;
            }
        }

        return null;
    }

    private void printDirector(boolean before) {
        String text = "Director " + (before ? "before" : "after") + " the performance:";

        System.out.println(text);
        System.out.println("\t" + director);
    }

    private void printPerformance() {
        System.out.println("----- PERFORMANCE -----");
        System.out.println(play);
        System.out.println("Actors:");

        for (ActorWithRole actorWithRole : actorWithRoles) {
            System.out.println("\t" + actorWithRole.getRole().getCharacterName()
                    + " - " + actorWithRole.getActor().getName());
        }

        System.out.println("----- END -----");
    }

    public void changeDirectorFields(Director director) {
        if (wasSuccess) {
            int increasedXP = director.getExperience() + play.valueOfLevel();
            director.setExperience(increasedXP);
        }

        int increasedPlayNum = director.getNumberOfDirectedPlays() + 1;
        director.setNumberOfDirectedPlays(increasedPlayNum);
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

    public ActorWithRole[] getActorWithRoles() {
        return actorWithRoles;
    }

    public void setActorWithRoles(ActorWithRole[] actorWithRoles) {
        this.actorWithRoles = actorWithRoles;
    }

    public boolean wasSuccess() {
        return wasSuccess;
    }

    public void setWasSuccess(boolean wasSuccess) {
        this.wasSuccess = wasSuccess;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}
