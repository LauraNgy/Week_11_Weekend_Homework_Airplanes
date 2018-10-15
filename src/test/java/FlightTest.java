import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING_767, "Wizzair");
        flight = new Flight("WIZZ43", "Sicily");
    }

    @Test
    public void hasPlane() {
        assertEquals(null, flight.getPlane());
    }

    @Test
    public void hasNumber() {
        assertEquals("WIZZ43", flight.getNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("Sicily", flight.getDestination());
    }

    @Test
    public void canSetPlane() {
        flight.setPlane(plane);
        assertEquals(plane, flight.getPlane());
    }
}
