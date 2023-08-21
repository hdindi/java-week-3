package org.example;

public class Ranger {

    private String location;
    private String rangerName;
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }
}
