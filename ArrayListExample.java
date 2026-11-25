

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arun");
        students.add("Rahul");

        System.out.println(students);

        System.out.println("First Student: " + students.get(0));

        students.remove("Arun");

        System.out.println("After Removal: " + students);
    }
}
