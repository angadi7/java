package com.Day26;

import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimezoneConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // Get the input time and timezones from the user
        System.out.println("Enter the date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeInput = scanner.nextLine();
        System.out.println("Enter the source timezone (e.g., America/New_York): ");
        String sourceTimezone = scanner.nextLine();
        System.out.println("Enter the target timezone (e.g., Europe/London): ");
        String targetTimezone = scanner.nextLine();

        // Parse the input time into a ZonedDateTime object
        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(
            LocalDateTime.parse(dateTimeInput, formatter), 
            ZoneId.of(sourceTimezone)
        );

        // Convert the time to the target timezone
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(ZoneId.of(targetTimezone));

        // Format the output time
        String formattedTargetTime = targetZonedDateTime.format(formatter);

        // Display the result
        System.out.println("The time in " + targetTimezone + " is: " + formattedTargetTime);

        // Close the scanner
        scanner.close();
    }
}
