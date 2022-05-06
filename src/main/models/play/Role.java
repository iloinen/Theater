package main.models.play;

import main.models.enums.RoleType;

public class Role {

    private Play play;
    private String characterName;
    private RoleType roleType;

    public Role(Play play, String characterName, RoleType roleType) {
        this.play = play;
        this.characterName = characterName;
        this.roleType = roleType;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

}
