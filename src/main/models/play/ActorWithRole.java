package main.models.play;

import main.models.troupe.Actor;

public class ActorWithRole {

    private Actor actor;
    private Role role;

    public ActorWithRole(Actor actor, Role role) {
        this.actor = actor;
        this.role = role;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
