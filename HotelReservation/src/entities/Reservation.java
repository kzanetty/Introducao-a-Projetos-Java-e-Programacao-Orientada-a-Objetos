package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reservation {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int duration(){
        Calendar calin = Calendar.getInstance();
        Calendar calout = Calendar.getInstance();
        calin.setTime(checkin);
        calout.setTime(checkout);
        long time = calout.getTimeInMillis() - calin.getTimeInMillis();
        int days = (int)Math.ceil(time/1000/60/60/24);
        return days;
    }

    @Override
    public String toString(){
        return "Room number: " + roomNumber
                + " - Checkin: " + sdf.format(checkin) + " - Checkout: " + sdf.format(checkout)
                + "\n - Duration: " + duration();
    }
}
