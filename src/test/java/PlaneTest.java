import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Passenger passenger;
    private Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Billy");
        plane = new Plane(PlaneType.BOEING_767, "Wizzair");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING_767, plane.getType());
    }

    @Test
    public void hasAirline() {
        assertEquals("Wizzair", plane.getAirline());
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, plane.getPassengersNumber());
    }

    @Test
    public void canAddPassengers() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengersNumber());
    }
}
