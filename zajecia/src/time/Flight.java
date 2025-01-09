package time;

import java.time.*;
import java.time.zone.ZoneRulesException;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private OffsetDateTime departureTime;//strefa czasowa lotniska wylotu
    private OffsetDateTime arrivalTime;//strefa casowa lotniska przylotu
    private Duration flightDuration;

    /*
    Dodaj metodę Duration calculateFlightDuration() w klasie Flight, która obliczy czas trwania lotu w godzinach i minutach.
    Obsługa Wprowadzania Czasu
     */
    public Duration calculateFlightDuration() {
        Duration duration = Duration.between(departureTime, arrivalTime);
        return duration;
    }

    public Flight(String flightNumber, String departureAirport, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        System.out.println(this.departureTime = parseIntoOffsetDateTime(departureAirport));
        System.out.println(departureTime.atZoneSameInstant(ZoneId.of("Europe/Warsaw")));
        this.arrivalAirport = arrivalAirport;
        System.out.println(this.arrivalTime = parseIntoOffsetDateTime(arrivalAirport));
        System.out.println(arrivalTime.atZoneSameInstant(ZoneId.of("Europe/Warsaw")));
        flightDuration = this.calculateFlightDuration();
        this.printDuration();
        if(flightDuration.isNegative()){
            throw new IllegalArgumentException("Cannot time travel");
        }

    }
    public static OffsetDateTime parseIntoOffsetDateTime(String dateTimeString){
        String[] times = dateTimeString.split(" ");
        LocalDateTime DateTime = LocalDateTime.parse(times[0].strip());
        ZoneId zoneID = ZoneId.of("Europe/Warsaw");
        try{
            zoneID = ZoneId.of(times[1].strip().replace("(","").replace(")",""));
        }catch (ZoneRulesException zre){
            throw new ZoneRulesException("wrong zone");
        }

        return OffsetDateTime.of(DateTime,zoneID.getRules().getOffset(DateTime));

    }
    public void printDuration(){
        System.out.println(String.format("%d h, %d min, %d sec", this.flightDuration.toHoursPart(), this.flightDuration.toMinutesPart(), this.flightDuration.toSecondsPart()));
    }
}
