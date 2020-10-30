package DefiningClassesLab.DefiningClassesLab2;

public class Car {
    public static int objectCounter = 0;
    String brand;
    String model;
    int horsePower;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.horsePower = -1;
     Car.objectCounter++;
    }

    public Car(String brand, String model, int horsePower) {
        this(brand, model);
        this.horsePower = horsePower;

    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public String carInfo() {

        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePower);
    }

}
