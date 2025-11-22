import java.util.Scanner;

public class claim extends base {

    public void start(Scanner sc) {

        // Show found items
        if (getItem_name().size() == 0) {
            System.out.println("No items available.");
            return;
        }

        System.out.println("\n===== CLAIMABLE ITEMS =====");
        for (int i = 0; i < getItem_name().size(); i++) {

            // Safety check — if status list isn't synced
            if (i >= getClaimStatus().size()) {
                System.out.println((i + 1) + ". " + getItem_name().get(i) +
                        " | Status: Unknown");
            } else {
                System.out.println((i + 1) + ". " + getItem_name().get(i) +
                        " | Status: " + getClaimStatus().get(i));
            }
        }

        System.out.print("Enter item number to claim (ex: 1): ");
        String input = sc.nextLine();

        int id;
        try {
            id = Integer.parseInt(input) - 1;  // convert to zero-based index
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return;
        }

        // validate index
        if (id < 0 || id >= getItem_name().size()) {
            System.out.println("Invalid item number.");
            return;
        }

        // Check claim status
        if (!getClaimStatus().get(id).equalsIgnoreCase("Available")) {
            System.out.println("⚠ This item cannot be claimed.");
            return;
        }

        // Ask claimant info
        System.out.print("Your name: ");
        String name = sc.nextLine();

        // Verification
        System.out.println("Verification Question: " + getVerificationQuestion().get(id));
        System.out.print("Your Answer: ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase(getVerificationAnswer().get(id))) {
            System.out.println("Correct! Claim Pending.");
            getClaimStatus().set(id, "Pending");
            getClaimantName().set(id, name);
        } else {
            System.out.println("Wrong answer. Claim denied.");
        }
    }
}
