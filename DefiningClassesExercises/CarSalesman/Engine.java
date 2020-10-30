package DefiningClassesExercises.CarSalesman;

public class Engine {
    //model, power, displacement and efficiency.
   private String model;
   private int power;
   //optional
   private int displacement;
   private String efficiency;
//    1 model, power, displacement and efficiency.
//    2 model, power, displacement
//    3 model, power, efficiency
//    4 model, power


    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String efficiency){
        this (model,power);
        this.efficiency = efficiency;
        this.displacement = 0;

    }

    public Engine(String model, int power, int displacement){
        this (model,power);
        this.displacement = displacement;
        this.efficiency = "n/a";

    }

    public Engine(String model, int power, int displacement, String efficiency){
        this (model,power);
        this.displacement = displacement;
        this.efficiency = efficiency;

    }

    public String getModel() {
        return model;
    }
    @Override
    public String toString(){
        if (this.displacement ==0){
            return String.format("Power: %d\n" +
                    "Displacement: n/a\n" +
                    "Efficiency: %s", this.power, this.efficiency);
        } else{
        return String.format("Power: %d\n" +
                "Displacement: %d\n" +
                "Efficiency: %s", this.power, this.displacement, this.efficiency);
    }
}}
