package main.models.troupe;

import main.models.play.ActorWithRole;
import main.models.play.Play;
import main.models.play.Role;

public class Director extends TroupeMember {

    private int experience;
    private int numberOfDirectedPlays;

    public Director(String name, int salary, int experience, int numberOfDirectedPlays) {
        super(name, salary);
        this.experience = experience;
        this.numberOfDirectedPlays = numberOfDirectedPlays;
    }

    public ActorWithRole[] giveRolesToActors(Troupe troupe, Play play) {
        ActorWithRole[] actorWithRoles = new ActorWithRole[play.getRoles().length];

        int membersIndex = 0;
        int actorWithRolesIndex = 0;

        for (Role role : play.getRoles()) {
            boolean roleGiven;

            do {
                TroupeMember member = troupe.getMembers()[membersIndex];
                roleGiven = canGiveRole(actorWithRoles, actorWithRolesIndex, member, role);

                if (membersIndex == troupe.getMembers().length - 1) {
                    membersIndex = 0;
                } else {
                    membersIndex++;
                }
            } while (!roleGiven);

            actorWithRolesIndex++;
        }

        return actorWithRoles;
    }

    private boolean canGiveRole(ActorWithRole[] actorWithRoles, int index, TroupeMember member, Role role) {
        if (member instanceof Actor actor) {
            if (actor.getRoleToPlay().equals(role.getRoleType())) {
                actorWithRoles[index] = new ActorWithRole(actor, role);
                return true;
            }
        }

        return false;
    }

    public double countWorthOfWork() {
        return (double) experience / numberOfDirectedPlays;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNumberOfDirectedPlays() {
        return numberOfDirectedPlays;
    }

    public void setNumberOfDirectedPlays(int numberOfDirectedPlays) {
        this.numberOfDirectedPlays = numberOfDirectedPlays;
    }

    @Override
    public String toString() {
        return name + " - XP: " + experience + ", plays: " + numberOfDirectedPlays;
    }

}
