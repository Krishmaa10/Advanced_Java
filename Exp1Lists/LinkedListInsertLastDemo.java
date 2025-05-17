package list_programs;

import java.util.*;

public class LinkedListInsertLastDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.offerLast("Pink");

        System.out.println("LinkedList after inserting at last:");
        System.out.println(list);
    }
}

