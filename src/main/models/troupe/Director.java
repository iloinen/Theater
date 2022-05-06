package main.models.troupe;

public class Director extends TroupeMember {

    private int experience;
    private int numberOfDirectedPlays;

    public Director(String name, int salary, int experience, int numberOfDirectedPlays) {
        super(name, salary);
        this.experience = experience;
        this.numberOfDirectedPlays = numberOfDirectedPlays;
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

}
