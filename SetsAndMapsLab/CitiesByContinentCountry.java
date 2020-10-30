package SetsAndMapsLab;

import java.util.*;

public class CitiesByContinentCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> data = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String county = tokens[1];
            String city = tokens[2];
            data.putIfAbsent(continent, new LinkedHashMap<>());
            data.get(continent).putIfAbsent(county, new ArrayList<>());
            data.get(continent).get(county).add(city);

        }
        data.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((innerKey, innerValue) -> {
                System.out.println("  " + innerKey + " -> "
                        + String.join(", ", innerValue));
            });

        });

    }
}
