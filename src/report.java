import java.util.Scanner;

public class report extends base {
    public void start(Scanner sc) {
        String[] category_sty_lost = {"Identification & Cards", "Electronics", "School Supplies", "Containers & Bottles", "Personal Accessories", "Clothing Items", "Miscellaneous"};

        System.out.print("Item name: ");
        String name = sc.nextLine();
        while (true) {
            if (name.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Name: ");
                name = sc.nextLine();
            }
            else {
                break;
            }
        }
        setItem_name_lost(name);

        int k = 1;
        for (String s : category_sty_lost) {
            System.out.println(k + " " + s);
            k++;
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
            setIdentification_card_lost("Identification & Cards");
            setItem_Category_lost("Identification & Cards");
        }
        else if (category == 2) {
            setElectronics_lost("Electronics");
            setItem_Category_lost("Electronics");
        }
        else if (category == 3) {
            setSchool_Supplies_lost("School Supplies");
            setItem_Category_lost("School Supplies");
        }
        else if (category == 4) {
            setContainers_Bottles_lost("Containers & Bottles");
            setItem_Category_lost("Containers & Bottles");
        }
        else if (category == 5) {
            setPersonal_Accessories_lost("Personal Accessories");
            setItem_Category_lost("Personal Accessories");
        }
        else if (category == 6) {
            setClothing_Items_lost("Clothing Items");
            setItem_Category_lost("Clothing Items");
        }
        else if (category == 7) {
            setMiscellaneous_lost("Miscellaneous");
            setItem_Category_lost("Miscellaneous");
        } else {
            System.out.println("Invalid category selected.");
        }

        System.out.print("Description / Details: ");
        String description = sc.nextLine();
        while (true) {
            if (description.trim().isEmpty()) {
                System.out.print("You entered nothing. Description / Details: ");
                description = sc.nextLine();
            }
            else {
                break;
            }
        }
        setDescription_lost(description);

        System.out.print("Item color: ");
        String color = sc.nextLine();
        while (true) {
            if (color.trim().isEmpty()) {
                System.out.print("You entered nothing. Item color: ");
                color = sc.nextLine();
            }
            else {
                break;
            }
        }
        setColor_lost(color);

        System.out.println("Item Brand: ");
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
        setBrand_lost(brand);

        System.out.print("When It Was Lost: ");
        String when = sc.nextLine();
        while (true) {
            if (when.trim().isEmpty()) {
                System.out.print("You entered nothing. When It Was Lost: ");
                when = sc.nextLine();
            }
            else {
                break;
            }
        }
        setWhen(when);

        System.out.print("Where It Was Lost ");
        String where = sc.nextLine();
        while (true) {
            if (where.trim().isEmpty()) {
                System.out.print("You entered nothing. Where It Was Lost: ");
                where = sc.nextLine();
            }
            else {
                break;
            }
        }
        setWhere(where);

        System.out.println("Student Name: ");
        String student = sc.nextLine();
        while (true) {
            if (student.trim().isEmpty()) {
                System.out.print("You entered nothing. Student Name: ");
                student = sc.nextLine();
            }
            else {
                break;
            }
        }
        setStudent_Name_lost(student);

        System.out.print("Student sr-code: ");
        String srCode = sc.nextLine();
        while (true) {
            if (srCode.trim().isEmpty()) {
                System.out.print("You entered nothing. Student sr-code: ");
                srCode = sc.nextLine();
            }
            else  {
                break;
            }
        }
        setSR_code_lost(srCode);

        System.out.print("G-suite: ");
        String g_suite = sc.nextLine();
        while (true) {
            if (g_suite.trim().isEmpty()) {
                System.out.print("You entered nothing. G-suite: ");
                g_suite = sc.nextLine();
            }
            else {
                break;
            }
        }
        setG_suite_lost(g_suite);

    }
}