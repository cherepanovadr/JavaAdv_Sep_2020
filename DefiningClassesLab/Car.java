package DefiningClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int horsepower;
    List<Part> parts;

    //Constructor
    public Car(String brand, String model, int horsepower) {
        this(brand, model);
        this.horsepower = horsepower;
    }

    public Car(String brand, String model) {
        this.model = model;
        this.brand = brand;
        this.parts = new ArrayList<>();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private int verifyHPNotLessThanOne(int horsepower) {
        return Math.max(horsepower, 0);

    }

    public void setModel(String model) {
        this.model = model;

    }

    public void setHorsepower(int horsepower) {
        this.horsepower = verifyHPNotLessThanOne(horsepower);
    }

    public String carInfo() {
        return this.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsepower == car.horsepower &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsepower);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void increaseHP(int value) {
        this.horsepower += value;
    }

    public String getBrandAsCapitalCases() {
        String brand = this.brand.toUpperCase();
        return brand;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsepower());
    }

}


