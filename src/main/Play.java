package main;

public class Play {

    private String author;
    private String title;
    private int numberOfActs;
    private int numberOfRoles;

    public Play(String author, String title, int numberOfActs, int numberOfRoles) {
        this.author = author;
        this.title = title;
        this.numberOfActs = numberOfActs;
        this.numberOfRoles = numberOfRoles;
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

    public int getNumberOfRoles() {
        return numberOfRoles;
    }

    public void setNumberOfRoles(int numberOfRoles) {
        this.numberOfRoles = numberOfRoles;
    }

}
