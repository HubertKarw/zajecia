package time;

import java.time.*;

public class Main {
    public static void main(String[] args) {
//        Flight flight = new Flight();
//        ZoneOffset offset = ZoneOffset.of("+2");
//        ZoneOffset offsetWaw = ZoneId.of("Europe/Warsaw").getRules().getOffset(Instant.now());
//        System.out.println(offsetWaw);
//        flight.departureTime = OffsetDateTime.now(offset);
//        flight.arrivalTime = flight.departureTime.plusHours(1).plusMinutes(30);
//        Flight flight2 = new Flight();
//        ZoneOffset offset2 = ZoneOffset.of("+1");
//        LocalDateTime dep = LocalDateTime.of(2025,3,30,1,0);
//        ZoneOffset offsetWaw1 = ZoneId.of("Europe/Warsaw").getRules().getOffset(dep);
//        LocalDateTime arr = LocalDateTime.of(2025,3,30,5,0);
//        ZoneOffset offsetWaw2 = ZoneId.of("Europe/Warsaw").getRules().getOffset(arr);
//        System.out.println(flight2.departureTime = OffsetDateTime.of(dep, offsetWaw1));
//        System.out.println(flight2.arrivalTime = OffsetDateTime.of(arr, offsetWaw2));
//        System.out.println(flight2.calculateFlightDuration());
        Flight flight1 = new Flight("1", "2025-01-15T10:00:00 (Europe/Warsaw)", "2025-01-15T12:30:00 (Europe/Warsaw)");
        Flight flight2 = new Flight("2", "2025-01-15T23:00:00 (Europe/Warsaw)", "2025-01-16T01:30:00 (Europe/Warsaw)");
        Flight flight3 = new Flight("3", "2025-01-15T10:00:00 (Europe/Warsaw)", "2025-01-15T14:00:00 (America/New_York)");
        Flight flight4 = new Flight("4", "2025-03-30T01:00:00 (Europe/Warsaw)", "2025-03-30T05:00:00 (Europe/Warsaw)");
        Flight flight5 = new Flight("5", "2025-10-26T01:00:00 (Europe/Warsaw)", "2025-10-26T02:30:00 (Europe/Warsaw)");
        Flight flight6 = new Flight("5", "2025-01-15T10:00:00 (Asia/Tokyo)", "2025-01-14T18:00:00 (America/Los_Angeles)");
//        Flight flight7 = new Flight("5","2025-01-15T10:00:00 (Aa/Tokyo)","2025-01-14T18:00:00 (America/Los_Angeles)");
//        Flight flight8 = new Flight("1","2025-01-15T10:00:00 (Europe/Warsaw)","2025-01-15T08:00:00 (Europe/Warsaw)");
//        Flight flight9 = new Flight("1","2025-01-15T10:00:00 (Europe/Warsaw)","2025-01-15T23:00:00 (Asia/Kolkata)");
        Flight flight10 = new Flight("5", "2025-01-15T06:00:00 (Europe/Warsaw)", "2025-01-16T06:00:00 (Asia/Singapore)");
        Flight flight11 = new Flight("5", "2025-01-15T08:00:00 (Europe/Warsaw)", "2025-01-15T12:00:00 (Europe/London)");
        Flight flight12 = new Flight("5", "2025-01-15T16:00:00 (Europe/London)", "2025-01-15T20:00:00 (Europe/Warsaw)");


    }
}
