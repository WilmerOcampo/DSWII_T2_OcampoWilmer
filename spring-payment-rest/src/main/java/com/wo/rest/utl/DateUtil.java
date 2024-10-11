package com.wo.rest.utl;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    // XMLGregorianCalendar to Date
    public static Date xmlGregorianCalendarToDate(XMLGregorianCalendar calendar) {
        return (calendar == null) ? null : calendar.toGregorianCalendar().getTime();
    }

    // Date to XMLGregorianCalendar
    public static XMLGregorianCalendar dateToXmlGregorianCalendar(Date date) {
        if (date == null) {
            return null;
        }
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException e) {
            throw new IllegalStateException("Error creating XMLGregorianCalendar", e);
        }
    }

    // Date String to Date with pattern
    public static Date dateStringToDate(String dateString, String pattern) throws ParseException {
        validateDateString(dateString);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(dateString);
    }

    // Date String to XMLGregorianCalendar with pattern
    public static XMLGregorianCalendar dateStringToXmlGregorianCalendar(String dateString, String pattern) {
        try {
            Date date = dateStringToDate(dateString, pattern);
            return dateToXmlGregorianCalendar(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date string format for pattern: " + pattern, e);
        }
    }

    // XMLGregorianCalendar to String with pattern
    public static String xmlGregorianCalendarToString(XMLGregorianCalendar calendar, String pattern) {
        return (calendar == null) ? null : formatDate(calendar.toGregorianCalendar().getTime(), pattern);
    }

    // Date to String with pattern
    public static String dateToString(Date date, String pattern) {
        return (date == null) ? null : formatDate(date, pattern);
    }

    private static String formatDate(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    private static void validateDateString(String dateString) {
        if (dateString == null || dateString.isEmpty()) {
            throw new IllegalArgumentException("Date string cannot be null or empty.");
        }
    }

}
