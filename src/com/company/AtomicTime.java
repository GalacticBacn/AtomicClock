package com.company;

/*
* Gets current time
*
* @author Harvey K
*
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class AtomicTime {
    // TODO: Change system time to atomic time
    public static String getCurrentTime() {
        Date currentTime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss a");
        return dateFormat.format(currentTime);
    }
}
