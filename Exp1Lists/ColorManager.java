package list_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many colors do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        // Input colors from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter color " + (i + 1) + ": ");
            String color = scanner.nextLine();
            colors.add(color);
        }

        System.out.println("Colors entered: " + colors);

        // Ask for index of element to remove
        System.out.print("Enter the index of the color to remove (0 to " + (colors.size() - 1) + "): ");
        int removeIndex = scanner.nextInt();

        // Validate and remove
        if (removeIndex >= 0 && removeIndex < colors.size()) {
            String removedColor = colors.remove(removeIndex);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid index! No color removed.");
        }

        System.out.println("Updated colors list: " + colors);

        scanner.close();
    }
}

