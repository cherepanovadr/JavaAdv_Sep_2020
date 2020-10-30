package Generics.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jarOne = new Jar<>();
        Jar<String> jarTwo = new Jar<>();

        jarOne.add(13);
        jarTwo.add("Leila");
        System.out.println(jarOne.remove());
        System.out.println(jarTwo.remove());
        JarOfPickles jarOfPickles = new JarOfPickles();
        jarOfPickles.add("Pepsi");
        System.out.println(jarOfPickles.remove());


        String[] elements = Main.<String>create(12, "element");
    }


    public static <T> T[] create(int length, T element) {
        T[] array = (T[]) new Object[length];
        return array;
    }
}
