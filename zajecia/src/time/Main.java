package time;

import java.time.*;

public class Main {
    public static void main(String[] args) {
    zad1();
    zad2();
    zad3();
    zad4();
    zad5();
    zad6();
    zad7();
    zad8();
    zad9();
    zad10();
    zad11();
    zad12();
        }

    public static void zad1 (){
        Flight flight1 = new Flight("1", "2025-01-15T10:00:00 (Europe/Warsaw)", "2025-01-15T12:30:00 (Europe/Warsaw)");
    }
    public static void zad2 (){
        Flight flight2 = new Flight("2", "2025-01-15T23:00:00 (Europe/Warsaw)", "2025-01-16T01:30:00 (Europe/Warsaw)");
    }
    public static void zad3 (){
        Flight flight3 = new Flight("3", "2025-01-15T10:00:00 (Europe/Warsaw)", "2025-01-15T14:00:00 (America/New_York)");
    }
    public static void zad4 (){
        Flight flight4 = new Flight("4", "2025-03-30T01:00:00 (Europe/Warsaw)", "2025-03-30T05:00:00 (Europe/Warsaw)");
    }
    public static void zad5 (){
        Flight flight5 = new Flight("5", "2025-10-26T01:00:00 (Europe/Warsaw)", "2025-10-26T02:30:00 (Europe/Warsaw)");
    }
    public static void zad6 (){
        Flight flight6 = new Flight("5", "2025-01-15T10:00:00 (Asia/Tokyo)", "2025-01-14T18:00:00 (America/Los_Angeles)");
    }
    public static void zad7 (){
        Flight flight7 = new Flight("5","2025-01-15T10:00:00 (Aa/Tokyo)","2025-01-14T18:00:00 (America/Los_Angeles)");
    }
    public static void zad8 (){
        Flight flight8 = new Flight("1","2025-01-15T10:00:00 (Europe/Warsaw)","2025-01-15T08:00:00 (Europe/Warsaw)");
    }
    public static void zad9 (){
        Flight flight9 = new Flight("1","2025-01-15T10:00:00 (Europe/Warsaw)","2025-01-15T23:00:00 (Asia/Kolkata)");
    }
    public static void zad10 (){
        Flight flight10 = new Flight("5", "2025-01-15T06:00:00 (Europe/Warsaw)", "2025-01-16T06:00:00 (Asia/Singapore)");
    }
    public static void zad11 (){
        Flight flight11 = new Flight("5", "2025-01-15T08:00:00 (Europe/Warsaw)", "2025-01-15T12:00:00 (Europe/London)");
    }
    public static void zad12 (){
        Flight flight12 = new Flight("5", "2025-01-15T16:00:00 (Europe/London)", "2025-01-15T20:00:00 (Europe/Warsaw)");
    }
}
