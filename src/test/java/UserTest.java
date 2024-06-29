import org.junit.jupiter.api.Test;
import org.pds.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldUpdateName() {
        User user = new User(1, "Old Name", "Department", "Description");
        user.updateName("New Name");
        assertEquals("New Name", user.getName());
    }

    @Test
    void shouldUpdateDepartment() {
        User user = new User(1, "Name", "Old Department", "Description");
        user.updateDepartment("New Department");
        assertEquals("New Department", user.getDepartment());
    }

    @Test
    void shouldUpdateDescription() {
        User user = new User(1, "Name", "Department", "Old Description");
        user.updateDescription("New Description");
        assertEquals("New Description", user.getDescription());
    }

    @Test
    void shouldCreateUserWithCorrectId() {
        User user = new User(1, "Name", "Department", "Description");
        assertEquals(1, user.getId());
    }

    @Test
    void shouldCreateUserWithCorrectName() {
        User user = new User(1, "Name", "Department", "Description");
        assertEquals("Name", user.getName());
    }

    @Test
    void shouldCreateUserWithCorrectDepartment() {
        User user = new User(1, "Name", "Department", "Description");
        assertEquals("Department", user.getDepartment());
    }

    @Test
    void shouldCreateUserWithCorrectDescription() {
        User user = new User(1, "Name", "Department", "Description");
        assertEquals("Description", user.getDescription());
    }
}