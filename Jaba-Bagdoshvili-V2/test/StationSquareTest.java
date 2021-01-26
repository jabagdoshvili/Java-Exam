import ge.edu.btu.Passenger;
import ge.edu.btu.Train;

import static org.junit.Assert.*;

public class StationSquareTest {

    @org.junit.Test
    public void main() {
        Passenger gio=new Passenger("Gio",true);
        Passenger nika=new Passenger("Nika",false);
        Passenger jaba=new Passenger("Jaba",true);
        Train train=new Train();

        assertEquals("Gio Has Ticket, He/She Is Permitted.",train.addPassenger(gio));
        assertEquals("Nika Has No Ticket, He/She Is Not Permitted.",train.addPassenger(nika));
        assertEquals("Jaba Has Ticket, He/She Is Permitted.",train.addPassenger(jaba));
    }
}