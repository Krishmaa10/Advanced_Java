package list_programs;


import java.util.*;

public class LinkedListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("Iterating from 2nd position:");
        Iterator<String> iterator = list.listIterator(1); 

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

