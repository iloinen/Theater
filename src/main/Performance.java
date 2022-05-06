package main;

public class Performance {

    private Troupe troupe;
    private Play play;
    private String[] playingActors;

    public Performance(Troupe troupe, Play play) {
        this.troupe = troupe;
        this.play = play;
        giveRolesToActors();
    }

    public void showMustGoOn() {
        System.out.println("----- PERFORMANCE -----");
        System.out.println(play.getTitle() + " by " + play.getAuthor());
        System.out.println("Actors:");

        for (String actorName : playingActors) {
            System.out.println("\t" + actorName);
        }
    }

    private void giveRolesToActors() {
        int roleCounter = play.getNumberOfRoles();
        int actorIndex = 0;

        playingActors = new String[roleCounter];

        while (roleCounter > 0) {
            giveOneRoleToActor(roleCounter - 1, troupe.getActorNames()[actorIndex]);

            roleCounter--;

            if (actorIndex == troupe.getActorNames().length - 1) {
                actorIndex = 0;
            } else {
                actorIndex++;
            }
        }
    }

    private void giveOneRoleToActor(int index, String actorName) {
        playingActors[index] = actorName;
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

    public String[] getPlayingActors() {
        return playingActors;
    }

    public void setPlayingActors(String[] playingActors) {
        this.playingActors = playingActors;
    }

}
