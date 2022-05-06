package main.models.troupe;

import main.models.enums.RoleType;

public class Actor extends TroupeMember {

    private RoleType roleToPlay;

    public Actor(String name, int salary, RoleType roleToPlay) {
        super(name, salary);
        this.roleToPlay = roleToPlay;
    }

    public RoleType getRoleToPlay() {
        return roleToPlay;
    }

    public void setRoleToPlay(RoleType roleToPlay) {
        this.roleToPlay = roleToPlay;
    }

}
