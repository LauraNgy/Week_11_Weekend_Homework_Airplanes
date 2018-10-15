import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    @Test
    public void hasName() {
        Passenger p = new Passenger("Billy Joe Jimbob");
        assertEquals("Billy Joe Jimbob", p.getName());
    }
}
