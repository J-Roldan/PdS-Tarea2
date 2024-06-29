import org.junit.jupiter.api.Test;
import org.pds.Room;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void shouldUpdateName() {
        Room room = new Room(1, "Old Name", "Location", true);
        room.updateName("New Name");
        assertEquals("New Name", room.getName());
    }

    @Test
    void shouldUpdateLocation() {
        Room room = new Room(1, "Name", "Old Location", true);
        room.updateLocation("New Location");
        assertEquals("New Location", room.getLocation());
    }

    @Test
    void shouldUpdateAvailability() {
        Room room = new Room(1, "Name", "Location", true);
        room.updateAvailability(false);
        assertFalse(room.getAvailability());
    }

    @Test
    void shouldCreateRoomWithCorrectId() {
        Room room = new Room(1, "Name", "Location", true);
        assertEquals(1, room.getId());
    }

    @Test
    void shouldCreateRoomWithCorrectName() {
        Room room = new Room(1, "Name", "Location", true);
        assertEquals("Name", room.getName());
    }

    @Test
    void shouldCreateRoomWithCorrectLocation() {
        Room room = new Room(1, "Name", "Location", true);
        assertEquals("Location", room.getLocation());
    }

    @Test
    void shouldCreateRoomWithCorrectAvailability() {
        Room room = new Room(1, "Name", "Location", true);
        assertTrue(room.getAvailability());
    }
}