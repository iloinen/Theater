package main;

public class Play {

    private String author;
    private String title;
    private int numberOfActs;
    private Role[] roles;

    public Play(String author, String title, int numberOfActs) {
        this.author = author;
        this.title = title;
        this.numberOfActs = numberOfActs;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfActs() {
        return numberOfActs;
    }

    public void setNumberOfActs(int numberOfActs) {
        this.numberOfActs = numberOfActs;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

}
