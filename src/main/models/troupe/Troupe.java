package main.models.troupe;

public class Troupe {

    private TroupeMember[] members;

    public Troupe(TroupeMember[] members) {
        this.members = members;
    }

    public TroupeMember[] getMembers() {
        return members;
    }

    public void setMembers(TroupeMember[] members) {
        this.members = members;
    }

}
