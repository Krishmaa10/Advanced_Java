package list_programs;

	// 1b.4: Write a java program for getting different colors through ArrayList interface 
	// and extract the elements 1st and 2nd from the ArrayList object by using SubList()

	import java.util.ArrayList;
	import java.util.List;

	public class ExtractColors {
	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("Original Colors List: " + colors);

	        List<String> extractedColors = colors.subList(0, 2);

	        System.out.println("Extracted Colors (1st and 2nd): " + extractedColors);
	    }
	}

