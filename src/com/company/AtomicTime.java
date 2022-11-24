package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class AtomicTime {
    public static String getCurrentTime() {
        Date currentTime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss a");
        return dateFormat.format(currentTime);
    }
}
