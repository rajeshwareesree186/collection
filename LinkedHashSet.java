

public class LinkedHashSet {
    public static void main(String[] args) {
    java.util.LinkedHashSet<String> cities = new java.util.LinkedHashSet<>();

        cities.add("Hyderabad");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Hyderabad");

        System.out.println(cities);

        cities.remove("Bangalore");

        System.out.println("After Removal: " + cities);
    }
}
