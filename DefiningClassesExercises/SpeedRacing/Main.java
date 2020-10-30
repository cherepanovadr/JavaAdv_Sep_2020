package DefiningClassesExercises.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Model, fuel amount, fuel cost for 1 kilometer and distance traveled.
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Car> cars = new LinkedHashMap<>();
        int a = Integer.parseInt(scanner.nextLine());
        while (a-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuel, consumption);
            cars.put(model, car);


        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String model = input.split("\\s+")[1];
            int distanceToDrive = Integer.parseInt(input.split("\\s+")[2]);
            Car carToDrive = cars.get(model);
            if (!carToDrive.drive(distanceToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }
            input = scanner.nextLine();

        }
        for (Car car : cars.values()) {
            System.out.println(car.toString());
        }
    }
}
