package main;

public class Troupe {

    private Actor[] actors;

    public Troupe(Actor[] actors) {
        this.actors = actors;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

}
