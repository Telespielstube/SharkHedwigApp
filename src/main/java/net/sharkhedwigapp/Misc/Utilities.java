package net.sharkhedwigapp.Misc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

    public static String formattedTimestamp() {
        return new SimpleDateFormat("dd.MM.YYYY'T'HH:mm:ss").format(new Date());
    }
}
