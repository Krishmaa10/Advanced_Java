package list_programs;


import java.util.*;

public class LinkedListSwapDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("Before swapping: " + list);

        Collections.swap(list, 0, 2);

        System.out.println("After swapping first and third elements: " + list);
    }
}
