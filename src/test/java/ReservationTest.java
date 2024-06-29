import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import org.pds.Reservation;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void shouldUpdateUserId() {
        Reservation reservation = new Reservation(1, 1, 1, LocalDate.now(), "Description");
        reservation.updateUserId(2);
        assertEquals(2, reservation.getUserId());
    }


    @Test
    void shouldUpdateRoomId() {
        Reservation reservation = new Reservation(1, 1, 1, LocalDate.now(), "Description");
        reservation.updateRoomId(2);
        assertEquals(2, reservation.getRoomId());
    }

    @Test
    void shouldUpdateDate() {
        Reservation reservation = new Reservation(1, 1, 1, LocalDate.now(), "Description");
        LocalDate newDate = LocalDate.of(2023, 1, 1);
        reservation.updateDate(newDate);
        assertEquals(newDate, reservation.getDate());
    }

    @Test
    void shouldUpdateDescription() {
        Reservation reservation = new Reservation(1, 1, 1, LocalDate.now(), "Description");
        reservation.updateDescription("New Description");
        assertEquals("New Description", reservation.getDescription());
    }

}