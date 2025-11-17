import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            String[] elements = {"Register", "Report", "Search", "Claim", "Admin"};
            for (int i = 0; i < elements.length; i++) {
                System.out.println((i + 1) + " " + elements[i]);
            }

            System.out.print("Enter your choice: ");
            // Basic choice reading - assumes the user types an integer
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Register selected");
                    // call register method or implement logic here
                    break;
                case 2:
                    System.out.println("Report selected");
                    // implement report logic here
                    break;
                case 3:
                    System.out.println("Search selected");
                    // implement search logic here
                    break;
                case 4:
                    System.out.println("Claim selected");
                    // implement claim logic here
                    break;
                case 5:
                    System.out.println("Admin selected");
                    // implement admin logic here
                    break;
                default:
                    System.out.println("INVALID NUMBER PLEASE ENTER 1 - 5");
            }

            System.out.print("reagain? y/n: ");
            String reagain = input.next();

            if (reagain.equalsIgnoreCase("n") || reagain.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }

        } while (true);

        input.close();
    }
}
