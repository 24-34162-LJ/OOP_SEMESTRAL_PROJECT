import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        register sr = new register();

        do {
            String[] elements = {"Register", "Report", "Search", "Claim", "Admin"};
            for (int i = 0; i < elements.length; i++) {
                System.out.println((i + 1) + " " + elements[i]);
            }

            System.out.print("Enter your choice: ");
            // safe input check
            if (!input.hasNextInt()) {
                System.out.println("Please enter a number 1-5.");
                input.next(); // consume invalid
                continue;
            }
            int choice = input.nextInt();
            input.nextLine(); // IMPORTANT: consume newline leftover

            switch (choice) {
                case 1:
                    System.out.println("Register selected");
                    sr.start(input);   // <-- pass the Scanner
                    break;
                case 2:
                    System.out.println("Report selected");
                    break;
                case 3:
                    System.out.println("Search selected");
                    break;
                case 4:
                    System.out.println("Claim selected");
                    break;
                case 5:
                    System.out.println("Admin selected");
                    break;
                default:
                    System.out.println("INVALID NUMBER PLEASE ENTER 1 - 5");
            }

            sr.display();

            System.out.print("reagain? y/n: ");
            String reagain = input.nextLine(); // use nextLine() to read whole line

            if (reagain.equalsIgnoreCase("n") || reagain.equalsIgnoreCase("no")) {
                System.out.println("Goodbye!");
                break;
            }

        } while (true);

        input.close(); // close scanner once at program termination
    }
}
