package Chutiyapppa.tools.hel;

public class motorBike extends bike {

    public int seatHeight;

    public motorBike(int speed, int gear, int startHeight) {
        super(speed, gear);
        seatHeight = startHeight;
    }
}
