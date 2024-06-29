package org.pds;

import java.time.LocalDate;

public class Reservation {
    private int id;
    private int userId;
    private int roomId;
    private LocalDate date;
    private String description;

    public Reservation(int id, int userId, int roomId, LocalDate date, String description) {
        this.id = id;
        this.userId = userId;
        this.roomId = roomId;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public int getUserId() {
        return this.userId;
    }

    public int getRoomId() {
        return this.roomId;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public void updateUserId(int userId) {
        this.userId = userId;
    }

    public void updateRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void updateDate(LocalDate date) {
        this.date = date;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

}
