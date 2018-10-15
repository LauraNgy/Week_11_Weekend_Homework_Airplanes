import java.util.ArrayList;

public class Airport {

    private String code;
    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;

    public Airport(String code) {
        this.code = code;
        this.hangar = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public String getCode() {
        return this.code;
    }

    public int getHangarSize() {
        return this.hangar.size();
    }

    public int getNumberofFlights() {
        return this.flights.size();
    }

    public void addPlanetoHangar(Plane plane) {
        this.hangar.add(plane);
    }

    public void createFlight(String flightNumber, String flightDestination, Plane plane) {
        Flight flight = new Flight(flightNumber, flightDestination);
        assignPlaneToFlight(flight);
        flights.add(flight);
    }

    public void assignPlaneToFlight(Flight flight) {
        Plane plane = hangar.get(0);
        hangar.remove(0);
        flight.setPlane(plane);
    }

    public void sellTicket(Passenger passenger, Flight flight) {
        flight.getPlane().addPassenger(passenger);
    }
}
