package DefiningClassesExercises;

public class Product {
    String name;
    String serialNumber;
    int weight;

    public Product(String name, String serialNuber) {
        this.name = name;
        this.serialNumber = serialNuber;
        this.weight = 0;
    }

    //getter
    public String getName() {
        return this.name;
    }

    //setter
    public void setName(String name) {
        if (name.length() <= 5 ) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }


}



