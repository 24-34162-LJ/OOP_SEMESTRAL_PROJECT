import java.util.Scanner;

public class register extends base {
    public void start(Scanner sc) {

        String[] category_sty = {"Identification & Cards", "Electronics", "School Supplies", "Containers & Bottles", "Personal Accessories", "Clothing Items", "Miscellaneous"};

        System.out.print("Item Name: ");
        String name = sc.nextLine();
        // if name is empty because of leftover newline, prompt again
        while (true) {
            if (name.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Name: ");
                name = sc.nextLine();
            }
            else  {
                break;
            }
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
            setCategory("Identification & Cards");
        }
        else if (category == 2) {
            setElectronics("Electronics");
            setCategory("Electronics");
        }
        else if (category == 3) {
            setSchool_Supplies("School Supplies");
            setCategory("School Supplies");
        }
        else if (category == 4) {
            setContainers_Bottles("Containers & Bottles");
            setCategory("Containers & Bottles");
        }
        else if (category == 5) {
            setPersonal_Accessories("Personal Accessories");
            setCategory("Personal Accessories");
        }
        else if (category == 6) {
            setClothing_Items("Clothing Items");
            setCategory("Clothing Items");
        }
        else if (category == 7) {
            setMiscellaneous("Miscellaneous");
            setCategory("Miscellaneous");
        } else {
            System.out.println("Invalid category selected.");
        }

        System.out.print("Item Description: ");
        String description = sc.nextLine();
        while (true) {
            if (description.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Description: ");
                description = sc.nextLine();
            }
            else   {
                break;
            }
        }
        setDescription(description);

        System.out.print("Item Color: ");
        String color = sc.nextLine();
        while (true) {
            if (color.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Color: ");
                color = sc.nextLine();
            }
            else {
                break;
            }
        }
        setItem_Color(color);

        System.out.print("Item brand: ");
        String brand = sc.nextLine();
        while (true) {
            if (brand.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Brand: ");
                brand = sc.nextLine();
            }
            else {
                break;
            }
        }
        setItem_Brand(brand);

        System.out.print("Item Distinguishing: ");
        String distinguishing = sc.nextLine();
        while (true) {
            if (distinguishing.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Distinguishing: ");
                distinguishing = sc.nextLine();
            }
            else {
                break;
            }
        }
        setItem_Distinguishing_Marks(distinguishing);

        System.out.print("Item date found: ");
        String date = sc.nextLine();
        while (true) {
            if (date.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Date: ");
                date = sc.nextLine();
            }
            else {
                break;
            }
        }
        setFound_Date(date);

        System.out.print("Item Location found: ");
        String location = sc.nextLine();
        while (true) {
            if (location.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Location: ");
                location = sc.nextLine();
            }
            else {
                break;
            }
        }
        setFound_Location(location);

        System.out.print("storage location: ");
        String storage_location = sc.nextLine();
        while (true) {
            if (storage_location.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Storage: ");
                storage_location = sc.nextLine();
            }
            else {
                break;
            }
        }
        setStorage_Location(storage_location);

        System.out.print("Set a verification question for this item: ");
        String q = sc.nextLine();
        setVerificationQuestion(q);

        System.out.print("Answer to the verification question: ");
        String a = sc.nextLine();
        setVerificationAnswer(a);

        // Item is available for claim
        setClaimStatus("Available");
        setClaimantName("None");
    }

}
