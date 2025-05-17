package list_programs;
// Program 1a: Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
	// and a LinkedList to perform the following operations:
	// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements,
	// 4. Accessing elements, 5. Updating elements, 6. Removing elements, 7. Searching elements,
	// 8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

	import java.util.*;

	public class ListOperations {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
	        LinkedList<String> linkedList = new LinkedList<>(arrayList);

	        System.out.println("ArrayList Operations");
	        performOperations(arrayList);

	        System.out.println("\nLinkedList Operations");
	        performOperations(linkedList);
	    }

	    public static void performOperations(List<String> list) {
	        list.add("Grapes");
	        System.out.println("After adding Grapes: " + list);

	        list.add(1, "Mango");
	        System.out.println("After adding Mango at index 1: " + list);

	        List<String> moreFruits = Arrays.asList("Pineapple", "Papaya");
	        list.addAll(moreFruits);
	        System.out.println("After adding multiple elements: " + list);
	        System.out.println("Element at index 2: " + list.get(2));
	        list.set(2, "Guava");
	        System.out.println("After updating index 2 with Guava: " + list);
	        list.remove("Banana");
	        System.out.println("After removing Banana: " + list);
	        boolean found = list.contains("Apple");
	        System.out.println("Contains 'Apple'? " + found);
	        System.out.println("List size: " + list.size());
	        System.out.print("Iterating using for-each: ");
	        for (String fruit : list) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();
	        System.out.print("Iterating using Iterator: ");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        System.out.println();
	        Collections.sort(list);
	        System.out.println("Sorted list: " + list);
	        if (list.size()>= 4) {
	            List<String> sublist = list.subList(1, 4);
	            System.out.println("Sublist (index 1 to 3):" + sublist);
	        } else {
	            System.out.println("Not enough elements for sublist.");
	        }
	        list.clear();
	        System.out.println("List after clearing: " + list);
	    }
	}

