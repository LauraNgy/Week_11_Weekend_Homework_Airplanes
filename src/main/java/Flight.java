public class Flight {

    private Plane plane;
    private String number;
    private String destination;

    public Flight( String number, String destination) {
        this.plane = null;
        this.number = number;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDestination() {
        return destination;
    }

    public String getNumber() {
        return number;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
