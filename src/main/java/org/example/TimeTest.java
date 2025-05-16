package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {

    public static void main(String[] args) throws ParseException {
        final String formatted = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        final Date isAdate = formatter.parse(formatter.format(Calendar.getInstance().getTime()));
        System.out.println(formatted);
        System.out.println(isAdate);

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);


    }

}
