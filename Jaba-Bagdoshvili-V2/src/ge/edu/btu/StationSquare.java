package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger gio=new Passenger("Gio",true);
        Passenger nika=new Passenger("Nika",false);
        Passenger jaba=new Passenger("Jaba",true);

        Train train=new Train();

        System.out.println(train.addPassenger(gio));
        System.out.println(train.addPassenger(nika));
        System.out.println(train.addPassenger(jaba));
    }
}
