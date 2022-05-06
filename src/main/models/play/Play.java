package main.models.play;

import main.models.enums.PlayGenre;
import main.models.enums.PlayLevel;

public class Play {

    private String author;
    private String title;
    private int numberOfActs;
    private Role[] roles;
    private PlayLevel level;
    private PlayGenre genre;

    public Play(String author, String title, int numberOfActs, PlayLevel level, PlayGenre genre) {
        this.author = author;
        this.title = title;
        this.numberOfActs = numberOfActs;
        this.level = level;
        this.genre = genre;
    }

    public int valueOfLevel() {
        return switch (level) {
            case EASY -> 10;
            case MEDIUM -> 50;
            case HARD -> 100;
        };
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

    public PlayLevel getLevel() {
        return level;
    }

    public void setLevel(PlayLevel level) {
        this.level = level;
    }

    public PlayGenre getGenre() {
        return genre;
    }

    public void setGenre(PlayGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " by " +
                author + " (" +
                level.toString().toLowerCase() + ") - " +
                genre.toString().toLowerCase();
    }

}
