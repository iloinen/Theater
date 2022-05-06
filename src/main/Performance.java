package main;

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

        int actorIndex = 0;

        for (int i = 0; i < play.getRoles().length; i++) {
            giveOneRoleToActor(i, troupe.getActors()[actorIndex], play.getRoles()[i]);

            if (actorIndex == troupe.getActors().length - 1) {
                actorIndex = 0;
            } else {
                actorIndex++;
            }
        }
    }

    private void giveOneRoleToActor(int index, Actor actor, Role role) {
        actorWithRoles[index] = new ActorWithRole(actor, role);
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
