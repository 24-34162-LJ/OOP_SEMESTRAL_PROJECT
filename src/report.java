import java.util.Scanner;

public class report extends base {
    public void start(Scanner sc) {
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

        System.out.print("Item Category: ");
        String category = sc.nextLine();
        while (true) {
            if (category.trim().isEmpty()) {
                System.out.print("You entered nothing. Item Category: ");
                category = sc.nextLine();
            }
            else {
                break;
            }
        }
        setItem_Category_lost(category);


    }
}