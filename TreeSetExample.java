

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(60);
        marks.add(95);
        marks.add(75);
        marks.add(85);

        System.out.println(marks);

        System.out.println("First Mark: " + marks.first());
        System.out.println("Last Mark: " + marks.last());
    }
}
