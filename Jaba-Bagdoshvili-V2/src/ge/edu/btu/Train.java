package ge.edu.btu;

import java.util.List;

public class Train {
    List<Passenger> passengerList;

    public String addPassenger(Passenger passenger){
        if(passenger.haveTicket()) return (passenger.getName()+" Has Ticket, He/She Is Permitted.");
        else return (passenger.getName()+" Has No Ticket, He/She Is Not Permitted.");
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
