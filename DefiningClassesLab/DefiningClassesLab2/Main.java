package DefiningClassesLab.DefiningClassesLab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        {
            cars.add(new Car("A", "B", 1));
            cars.add(new Car("A", "B"));
            cars.add(new Car("A"));
        }
        System.out.println(cars.size());
        System.out.println(Car.objectCounter);


//        int a = Integer.parseInt(scanner.nextLine());
//        while(a-- >0){
//            String[] input = scanner.nextLine().split("\\s+");
//            if(input.length ==1 ){
//               Car car = new Car(input[0]);
//                System.out.println(car.carInfo());
//            } else if (input.length ==2){
//                Car car = new Car(input[0], input[1]);
//                System.out.println(car.carInfo());
//            } else {
//                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
//                System.out.println(car.carInfo());
//
//            }
//        }


    }
}
