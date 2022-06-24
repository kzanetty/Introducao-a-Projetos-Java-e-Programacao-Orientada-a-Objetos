package entities.util;

import java.util.Date;

public class Checks {

    public static boolean check(Date checkin, Date checkout) {
        if (checkin.before(new Date()) || checkout.before(checkin)) {
            return false;
        } else {
            return true;
        }
    }

    public static void msgInconsistentData(){
        System.out.println("Your data is wrong. Please, try again.");
    }

    public static void jumpLine(){
        System.out.println();
    }
}
