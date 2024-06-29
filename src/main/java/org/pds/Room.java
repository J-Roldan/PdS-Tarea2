package org.pds;

public class Room {
    private int id;
    private String name;
    private String location;
    private boolean available;

    public Room (int id, String name, String location, boolean available) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.available = available;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public boolean getAvailability(){
        return this.available;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateLocation(String location) {
        this.location = location;
    }

    public void updateAvailability(boolean available) {
        this.available = available;
    }

}
