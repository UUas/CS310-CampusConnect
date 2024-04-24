package com.sabanciuniv.model;
import java.util.ArrayList;
import java.util.List;

public class Clubs {
    private String clubName;
    private int clubID;
    private String clubPresident;
    private List<String> authorizedMembers;
    private List<String> clubEvents;

    // Constructor
    public Clubs(String clubName, int clubID, String clubPresident) {
        this.clubName = clubName;
        this.clubID = clubID;
        this.clubPresident = clubPresident;
        this.authorizedMembers = new ArrayList<>();
        this.clubEvents = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public String getClubPresident() {
        return clubPresident;
    }

    public void setClubPresident(String clubPresident) {
        this.clubPresident = clubPresident;
    }

    public List<String> getAuthorizedMembers() {
        return authorizedMembers;
    }

    public List<String> getClubEvents() {
        return clubEvents;
    }

    // Sample member functions
    public void addEvent(String event) {
        clubEvents.add(event);
    }

    public void addAuthorizedMember(String member) {
        authorizedMembers.add(member);
    }
}
