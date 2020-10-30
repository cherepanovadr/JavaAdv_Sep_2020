package DefiningClassesLab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        while (n-- > 0) {
//            String[] tokens = scanner.nextLine().split("\\s+");
//            Car car = new Car();
//            car.setBrand(tokens[0]);
//            car.setModel(tokens[1]);
//            car.setHorsepower(Integer.parseInt(tokens[2]));
//            System.out.println(car.carInfo());
//        }
        Car car = new Car("MRZ", "gfg", 15 );
        System.out.println(car.getBrand().toUpperCase());


    }
}
