import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Passenger passenger;
    private Plane plane;
    private Flight flight;
    private Airport airport;

    @Before
    public void before() {
        passenger = new Passenger("Billy");
        plane = new Plane(PlaneType.BOEING_767, "Ryanair");
        flight = new Flight("WIZZ43", "Sicily");
        airport = new Airport("EDI");
    }

    @Test
    public void hasCode() {
        assertEquals("EDI", airport.getCode());
    }

    @Test
    public void hasEmptyHangar() {
        assertEquals(0, airport.getHangarSize());
    }

    @Test
    public void hasNoInitialFlights() {
        assertEquals(0, airport.getNumberofFlights());
    }

    @Test
    public void canAddPlaneToHangar() {
        airport.addPlanetoHangar(plane);
        assertEquals(1, airport.getHangarSize());
    }

    @Test
    public void canAssignPlaneToFlight() {
        airport.assignPlaneToFlight(flight);
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canCreateFlights() {
        airport.createFlight("WIZZ43", "Ibiza", plane);
        assertEquals(1, airport.getNumberofFlights());
    }

    @Test
    public void canSellTickets() {
        airport.sellTicket(passenger, flight);
        assertEquals(1, plane.getPassengersNumber());
    }
}
