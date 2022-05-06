package main;

public class Actor {

    private String name;
    private int salary;
    private RoleType roleToPlay;

    public Actor(String name, int salary, RoleType roleToPlay) {
        this.name = name;
        this.salary = salary;
        this.roleToPlay = roleToPlay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public RoleType getRoleToPlay() {
        return roleToPlay;
    }

    public void setRoleToPlay(RoleType roleToPlay) {
        this.roleToPlay = roleToPlay;
    }

}
