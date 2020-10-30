package parking;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Initialize the repository
        Parking parking = new Parking("Underground parking garage", 5);

// Initialize entity
        Car volvo = new Car("Volvo", "XC70", 2010);

// Print Car
        System.out.println(volvo); // Volvo XC70 (2010)

// Add Car
        parking.add(volvo);
// Remove Car
        System.out.println(parking.remove("Volvo", "XC90")); // false
        System.out.println(parking.remove("Volvo", "XC70")); // true

        Car peugeot = new Car("Peugeot", "307", 2011);
        Car audi = new Car("Audi", "S4", 2005);

        parking.add(peugeot);
        parking.add(audi);

// Get Latest Car
        Car latestCar = parking.getLatestCar();
        System.out.println(latestCar); // Peugeot 307 (2011)

// Get Car
        Car audiS4 = parking.getCar("Audi", "S4");
        System.out.println(audiS4); // Audi S4 (2005)

// Count
        System.out.println(parking.getCount()); // 2

// Get Statistics
        System.out.println(parking.getStatistics());
// The cars are parked in Underground parking garage:
// Peugeot 307 (2011)
// Audi S4 (2005)

    }

    public static class Parking {
        private List<Car> data;
        private String type;
        private int capacity;

        public Parking(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
            this.data = new ArrayList<>();
        }


        public void add(Car car) {
            this.data.add(car);
        }


        public boolean remove(String man, String mod) {
            for (Car car : data) {
                if (car.getManufacturer().equals(man) && car.getModel().equals(mod)) {
                    this.data.remove(car);
                    return true;
                }

            }
            return false;
        }

        public Car getLatestCar() {
            Car result = null;
            for (Car car : data) {
                if (result == null || result.getYear() < car.getYear()) {
                    result = car;
                }
            }
            return result;
        }

        public Car getCar(String man, String mod) {
            for (Car datum : data) {
                if (datum.getManufacturer().equals(man) && datum.getModel().equals(mod)) {
                    return datum;
                }

            }
            return null;
        }

        public int getCount() {
            return this.data.size();
        }

        public String getStatistics() {
            StringBuilder out = new StringBuilder();

            out.append(String.format("The cars are parked in %s:%n", this.type));
            for (Car car : data) {
                out.append(car);
                out.append(System.lineSeparator());
            }
            return out.toString().trim();


        }
    }
}