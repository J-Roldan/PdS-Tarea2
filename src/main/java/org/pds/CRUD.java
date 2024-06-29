package org.pds;

import java.time.LocalDate;

public class CRUD {
    private User[] users;
    private Room[] rooms;
    private Reservation[] reservations;
    
    public CRUD() {
        this.users = new User[0];
        this.rooms = new Room[0];
        this.reservations = new Reservation[0];
    }

    public User[] getUsers() {
        return this.users;
    }
    
    public User getUser(int id) {
        for (User user : this.users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String name, String department, String description) {
        User newUser = new User(this.users.length + 1, name, department, description);
        User[] newUsers = new User[this.users.length + 1];
        System.arraycopy(this.users, 0, newUsers, 0, this.users.length);
        newUsers[this.users.length] = newUser;
        this.users = newUsers;
    }
    
    public void updateUser(int id, String name, String department, String description) {
        for (User user : this.users) {
            if (user.getId() == id) {
                user.updateName(name);
                user.updateDepartment(department);
                user.updateDescription(description);
            }
        }
    }
    
    public void deleteUser(int id) {
        User[] newUsers = new User[this.users.length - 1];
        int j = 0;
        for (User user : this.users) {
            if (user.getId() != id) {
                newUsers[j] = user;
                j++;
            }
        }
        this.users = newUsers;
    }
    
    public Room[] getRooms() {
        return this.rooms;
    }
    
    public Room getRoom(int id) {
        for (Room room : this.rooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }
    
    public void addRoom(String name, String location, boolean available) {
        Room newRoom = new Room(this.rooms.length + 1, name, location, available);
        Room[] newRooms = new Room[this.rooms.length + 1];
        System.arraycopy(this.rooms, 0, newRooms, 0, this.rooms.length);
        newRooms[this.rooms.length] = newRoom;
        this.rooms = newRooms;
    }

    public void updateRoom(int id, String name, boolean available) {
        for (Room room : this.rooms) {
            if (room.getId() == id) {
                room.updateName(name);
                room.updateAvailability(available);
            }
        }
    }

    public void deleteRoom(int id) {
        Room[] newRooms = new Room[this.rooms.length - 1];
        int j = 0;
        for (Room room : this.rooms) {
            if (room.getId() != id) {
                newRooms[j] = room;
                j++;
            }
        }
        this.rooms = newRooms;
    }

    public Reservation[] getReservations() {
        return this.reservations;
    }

    public Reservation getReservation(int id) {
        for (Reservation reservation : this.reservations) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }

    public void addReservation(int userId, int roomId, LocalDate date, String description) {
        boolean roomExists = false;
        for (Room room : this.rooms) {
            if (room.getId() == roomId && room.getAvailability()) {
                roomExists = true;
                room.updateAvailability(false);
            } else if (room.getId() == roomId && !room.getAvailability()) {
                System.err.println("Room not available");
                return;
            }
        }
        if (!roomExists) {
            System.err.println("Room not found");
            return;
        }

        boolean userExists = false;
        for (User user: this.users) {
            if (user.getId() == userId) {
                userExists = true;
            }
        }
        if (!userExists) {
            System.err.println("User not found");
            return;
        }


        for (Reservation reservation : this.reservations) {
            if (reservation.getDate().equals(date) && reservation.getUserId() == userId) {
                System.err.println("User already reserved");
                return;
            }
            if (reservation.getDate().isAfter(date) && reservation.getUserId() == userId) {
                System.err.println("User already reserved another room");
                return;
            }
        }


        Reservation newReservation = new Reservation(this.reservations.length + 1, userId, roomId, date, description);
        Reservation[] newReservations = new Reservation[this.reservations.length + 1];
        System.arraycopy(this.reservations, 0, newReservations, 0, this.reservations.length);
        newReservations[this.reservations.length] = newReservation;
        this.reservations = newReservations;
    }

    public void updateReservation(int id, int userId, int roomId, LocalDate date, String description) {
        for (Reservation reservation : this.reservations) {
            if (reservation.getId() != id && reservation.getUserId() == userId) {
                if (reservation.getDate().equals(date) || reservation.getDate().isAfter(date) ) {
                    System.err.println("User already reserved");
                    return;
                }
            }
            if (reservation.getId() == id) {
                boolean userExists = false;
                boolean roomExists = false;
                for (Room room : this.rooms) {
                    if (reservation.getRoomId() != roomId) {
                        if (room.getId() == roomId && room.getAvailability()) {
                            roomExists = true;
                            room.updateAvailability(false);
                        } else if (room.getId() == roomId && !room.getAvailability()) {
                            System.err.println("Room not available");
                            return;
                        }
                    } else {
                        roomExists = true;
                    }
                }
                if (!roomExists) {
                    System.err.println("Room not found");
                    return;
                }

                for (User user: this.users) {
                    if (user.getId() == userId) {
                        userExists = true;
                    }
                }
                if (!userExists) {
                    System.err.println("User not found");
                    return;
                }
                reservation.updateUserId(userId);
                reservation.updateRoomId(roomId);
                reservation.updateDate(date);
                reservation.updateDescription(description);
                return;
            }
        }
        System.err.println("Reservation not found");
    }

    public void deleteReservation(int id) {
        Reservation[] newReservations = new Reservation[this.reservations.length - 1];
        int j = 0;
        for (Reservation reservation : this.reservations) {
            if (reservation.getId() != id) {
                newReservations[j] = reservation;
                j++;
            }
        }
        this.reservations = newReservations;
    }
}
