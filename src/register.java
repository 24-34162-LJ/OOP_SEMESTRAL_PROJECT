import java.util.Scanner;

public class register extends base {
    // accept Scanner from main so we reuse the same System.in scanner
    public void start(Scanner sc) {

        String[] category_sty = {"Identification & Cards", "Electronics", "School Supplies", "Containers & Bottles", "Personal Accessories", "Clothing Items", "Miscellaneous"};

        System.out.print("Item Name: ");
        String name = sc.nextLine();
        // if name is empty because of leftover newline, prompt again
        if (name.trim().isEmpty()) {
            System.out.print("You entered nothing. Item Name: ");
            name = sc.nextLine();
        }
        setItem_name(name);

        int y = 1;
        for (String s : category_sty) {
            System.out.println(y + " " + s);
            y++;
        }

        System.out.print("Item Category (1-7): ");
        // validate integer input
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a number 1-7.");
            sc.next(); // consume invalid token
        }
        int category = sc.nextInt();
        sc.nextLine(); // consume newline after nextInt()

        if  (category == 1) {
            setIdentification_card("Identification & Cards");
        }
        else if (category == 2) {
            setElectronics("Electronics");
        }
        else if (category == 3) {
            setSchool_Supplies("School Supplies");
        }
        else if (category == 4) {
            setContainers_Bottles("Containers & Bottles");
        }
        else if (category == 5) {
            setPersonal_Accessories("Personal Accessories");
        }
        else if (category == 6) {
            setClothing_Items("Clothing Items");
        }
        else if (category == 7) {
            setMiscellaneous("Miscellaneous");
        } else {
            System.out.println("Invalid category selected.");
        }



    }
}
