package DefiningClassesExercises;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Eg", "12345");

        System.out.println(product.getName());
        product.setName("testkkjijk");
        System.out.println(product.getName());
    }


}
