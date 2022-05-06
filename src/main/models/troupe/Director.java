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

    public ActorWithRole[] giveAllRoles(Troupe troupe, Play play) {
        ActorWithRole[] actorWithRoles = new ActorWithRole[play.getRoles().length];
        int maxTryToGiveRole = troupe.getMembers().length * 2;

        int membersIndex = 0;
        int actorWithRolesIndex = 0;

        for (Role role : play.getRoles()) {
            giveRole(troupe, role, actorWithRoles, actorWithRolesIndex, membersIndex, maxTryToGiveRole);

            actorWithRolesIndex++;
        }

        return actorWithRoles;
    }

    private void giveRole(Troupe troupe, Role role, ActorWithRole[] actorWithRoles,
                          int actorWithRolesIndex, int membersIndex, int maxTryToGiveRole) {
        boolean roleGiven;
        int counter = 0;

        do {
            TroupeMember member = troupe.getMembers()[membersIndex];

            roleGiven = canGiveRole(actorWithRoles, actorWithRolesIndex, member, role);

            if (membersIndex == troupe.getMembers().length - 1) {
                membersIndex = 0;
            } else {
                membersIndex++;
            }

            counter++;
        } while (!roleGiven && (counter < maxTryToGiveRole) );

        if (!roleGiven) {
            pickAnyActor(actorWithRoles, actorWithRolesIndex, troupe.getMembers(), role);
        }
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

    private void pickAnyActor(ActorWithRole[] actorWithRoles, int index, TroupeMember[] members, Role role) {
        for (TroupeMember member : members) {
            if (member instanceof Actor actor) {
                actorWithRoles[index] = new ActorWithRole(actor, role);
            }
        }
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
