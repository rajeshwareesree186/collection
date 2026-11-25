

public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> courses = new java.util.HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("React");
        courses.add("Java");

        System.out.println(courses);

        System.out.println("Contains Java: " + courses.contains("Java"));

        courses.remove("Python");

        System.out.println("After Removal: " + courses);
    }
}
