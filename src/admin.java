import java.util.Scanner;

public class admin extends base {

    public void start(Scanner sc) {

        System.out.println("\n===== PENDING CLAIMS =====");

        boolean hasPending = false;

        for (int i = 0; i < getItem_name().size(); i++) {
            if (getClaimStatus().get(i).equals("Pending")) {
                hasPending = true;
                System.out.println((i + 1) + ". " + getItem_name().get(i) +
                        " | Claimed by: " + getClaimantName().get(i));
            }
        }

        if (!hasPending) {
            System.out.println("No pending claims.");
            return;
        }

        System.out.print("Enter item ID to approve/reject: ");
        int id = sc.nextInt() - 1;
        sc.nextLine();

        System.out.print("Approve or Reject? (a/r): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("a")) {
            getClaimStatus().set(id, "Claimed");
            System.out.println("Item marked as CLAIMED.");
        } else if (choice.equalsIgnoreCase("r")) {
            getClaimStatus().set(id, "Available");
            getClaimantName().set(id, "None");
            System.out.println("Claim rejected.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
