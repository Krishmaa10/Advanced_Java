package list_programs;


	// 1b.Write a java program for getting different colors through ArrayList interface 
	// and search whether the color "Red" is available or not

	import java.util.ArrayList;

	public class SearchColor {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("Colors List: " + colors);

	        if (colors.contains("Red")) {
	            System.out.println("Color Red is available in the list.");
	        } else {
	            System.out.println("Color Red is NOT available in the list.");
	        }
	    }
	}

