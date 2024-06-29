import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import org.pds.CRUD;
import org.pds.User;
import org.pds.Room;
import org.pds.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class CRUDTest {

    @Test
    void shouldAddUser() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        User user = crud.getUser(1);
        assertEquals("John", user.getName());
    }

    @Test
    void shouldUpdateUser() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        crud.updateUser(1, "Jane", "HR", "New Description");
        User user = crud.getUser(1);
        assertEquals("Jane", user.getName());
    }

    @Test
    void shouldDeleteUser() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        crud.deleteUser(1);
        User user = crud.getUser(1);
        assertNull(user);
    }

    @Test
    void shouldAddRoom() {
        CRUD crud = new CRUD();
        crud.addRoom("Conference", "First Floor", true);
        Room room = crud.getRoom(1);
        assertEquals("Conference", room.getName());
    }

    @Test
    void shouldUpdateRoom() {
        CRUD crud = new CRUD();
        crud.addRoom("Conference", "First Floor", true);
        crud.updateRoom(1, "Meeting", false);
        Room room = crud.getRoom(1);
        assertEquals("Meeting", room.getName());
    }

    @Test
    void shouldDeleteRoom() {
        CRUD crud = new CRUD();
        crud.addRoom("Conference", "First Floor", true);
        crud.deleteRoom(1);
        Room room = crud.getRoom(1);
        assertNull(room);
    }

    @Test
    void shouldAddReservation() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        crud.addRoom("Conference", "First Floor", true);
        crud.addReservation(1, 1, LocalDate.now(), "10:00");
        Reservation reservation = crud.getReservation(1);
        assertEquals(1, reservation.getUserId());
    }

    @Test
    void shouldUpdateReservation() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        crud.addRoom("Conference", "First Floor", true);
        crud.addReservation(1, 1, LocalDate.now(),  "description");
        crud.updateReservation(1, 1, 1, LocalDate.now(), "11:00");
        Reservation reservation = crud.getReservation(1);
        assertEquals("11:00", reservation.getDescription());
    }

    @Test
    void shouldDeleteReservation() {
        CRUD crud = new CRUD();
        crud.addUser("John", "IT", "Description");
        crud.addRoom("Conference", "First Floor", true);
        crud.addReservation(1, 1, LocalDate.now(), "10:00");
        crud.deleteReservation(1);
        Reservation reservation = crud.getReservation(1);
        assertNull(reservation);
    }
}