

import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Learn Java");
        tasks.add("Learn SQL");
        tasks.add("Learn React");

        tasks.addFirst("Start Training");
        tasks.addLast("Build Project");

        System.out.println(tasks);

        tasks.removeFirst();

        System.out.println("After Removal: " + tasks);
    }
}
