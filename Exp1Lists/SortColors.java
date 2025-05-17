package list_programs;


	// 1b.3: Write a java program for getting different colors through ArrayList interface 
	// and sort them using Collections.sort( ArrayListObj )

	import java.util.ArrayList;
	import java.util.Collections;

	public class SortColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("Original Colors List: " + colors);
	        Collections.sort(colors);
	        System.out.println("Sorted Colors List: " + colors);
	    }
	}

