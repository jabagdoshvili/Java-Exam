package ge.edu.btu;

public class Passenger {
    String name;
    Boolean ticket;

    public String getName() {
        return name;
    }

    public Boolean haveTicket() {
        return ticket;
    }

    public Passenger(String name, Boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }
}