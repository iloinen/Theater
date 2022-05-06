package main.models.troupe;

public class PropMan extends TroupeMember {

    private String[] propNames;

    public PropMan(String name, int salary, String[] propNames) {
        super(name, salary);
        this.propNames = propNames;
    }

    public String[] getPropNames() {
        return propNames;
    }

    public void setPropNames(String[] propNames) {
        this.propNames = propNames;
    }

}
