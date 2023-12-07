// Write your code here. 
package com.example.player;

public class Player {
    private int id;
    private String name;
    private int jerseyNum;
    private String role;

    Player(int id, String name, int jerseyNum, String role) {
        this.id = id;
        this.name = name;
        this.jerseyNum = jerseyNum;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getjerseyNum() {
        return jerseyNum;
    }

    public void setjerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
