package main.models.play;

import main.models.troupe.Director;
import main.models.troupe.Troupe;
import main.models.troupe.TroupeMember;

public class Performance {

    private Troupe troupe;
    private Play play;
    private ActorWithRole[] actorWithRoles;

    private boolean wasSuccess;

    public Performance(Troupe troupe, Play play) {
        this.troupe = troupe;
        this.play = play;
    }

    public Director findDirector() {
        for (TroupeMember member : troupe.getMembers()) {
            if (member instanceof Director director) {
                return director;
            }
        }

        return null;
    }

    public void showMustGoOn() {
        System.out.println("----- PERFORMANCE -----");
        System.out.println(play.getTitle() + " by " + play.getAuthor());
        System.out.println("Actors:");

        for (ActorWithRole actorWithRole : actorWithRoles) {
            System.out.println("\t" + actorWithRole.getRole().getCharacterName()
                    + " - " + actorWithRole.getActor().getName());
        }

        setWasSuccess(Math.random() > 0.5);
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

}
