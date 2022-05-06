package main.models.troupe;

public class Troupe {

    private String name;
    private TroupeMember[] members;

    public Troupe(String name, TroupeMember[] members) {
        this.name = name;
        this.members = members;
    }

    public TroupeMember[] getMembers() {
        return members;
    }

    public void setMembers(TroupeMember[] members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
