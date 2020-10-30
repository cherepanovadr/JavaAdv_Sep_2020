package SetsAndMapsLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String command = input.substring(0, input.indexOf(", "));
            String registrationPlate = input.substring(input.indexOf(", ") + 2);

            if (command.equals("IN")) {
                parkingLot.add(registrationPlate);
            } else {
                parkingLot.remove(registrationPlate);
            }

            input = scanner.nextLine();
        }
        String output = String.join(System.lineSeparator(), parkingLot);
        if (output.isEmpty()) {
            System.out.println("parking.Main.Parking Lot is Empty");
        } else {
            System.out.println(output);
        }
    }
}
