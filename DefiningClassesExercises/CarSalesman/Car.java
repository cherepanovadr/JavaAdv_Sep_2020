package DefiningClassesExercises.CarSalesman;

public class Car {
    //a model, engine, weight and color
    private String model;
    private String engine;
   //optional
    private int weight;
    private String color;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }
    public Car(String model, String engine,int weight ) {
        this(model,engine);
        this.weight = weight;
        this.color = "n/a";

    }
    public Car(String model, String engine,String color) {
        this(model,engine);
        this.color = color;
        this.weight = 0;

    }
    public Car(String model, String engine,int weight, String color) {
        this(model,engine);
        this.weight = weight;
        this.color = color;

    }
    public String getModel(){
       return this.model;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getEngine(){
        return this.engine;
    }


}
