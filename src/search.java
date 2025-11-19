import java.util.Scanner;

public class search extends base {

    public void Search_bar(Scanner sc) {

        System.out.print("Please enter the name of the item you would like to search for: ");
        String item = sc.nextLine();

        // Prevent empty input
        while (item.trim().isEmpty()) {
            System.out.print("You entered nothing. Item Name: ");
            item = sc.nextLine();
        }

        boolean found = false;
        boolean found2 = false;

        // 🔎 SEARCH IN FOUND ITEMS
        for (int i = 0; i < getItem_name().size(); i++) {

            if (getItem_name().get(i).equalsIgnoreCase(item)) {

                System.out.println("\n==============================");
                System.out.println("        FOUND ITEM");
                System.out.println("==============================");
                System.out.println("Item Name: " + getItem_name().get(i));
                System.out.println("Category: " + getCategory().get(i));
                System.out.println("Color: " + getItem_Color().get(i));
                System.out.println("Brand: " + getItem_Brand().get(i));
                System.out.println("Marks: " + getItem_Distinguishing_Marks().get(i));
                System.out.println("Found Date: " + getFound_Date().get(i));
                System.out.println("Found Location: " + getFound_Location().get(i));
                System.out.println("Storage Location: " + getStorage_Location().get(i));

                found = true; // Keep searching for duplicates
            }
        }

        // 🔎 SEARCH IN LOST ITEMS
        for (int i = 0; i < getItem_name_lost().size(); i++) {

            if (getItem_name_lost().get(i).equalsIgnoreCase(item)) {

                System.out.println("\n==============================");
                System.out.println("         LOST ITEM");
                System.out.println("==============================");
                System.out.println("Item Name: " + getItem_name_lost().get(i));
                System.out.println("Category: " + getItem_Category_lost().get(i));
                System.out.println("Description: " + getDescription_lost().get(i));
                System.out.println("Color: " + getColor_lost().get(i));
                System.out.println("Brand: " + getBrand_lost().get(i));
                System.out.println("When Lost: " + getWhen().get(i));
                System.out.println("Where Lost: " + getWhere().get(i));
                System.out.println("Student Name: " + getStudent_Name_lost().get(i));
                System.out.println("SR-Code: " + getSR_code_lost().get(i));
                System.out.println("G-Suite: " + getG_suite_lost().get(i));

                found2 = true; // Also keep searching for duplicates
            }
        }

        // No match from both sections
        if (!found && !found2) {
            System.out.println("\nNo item found / No record found.");
        }
    }
}