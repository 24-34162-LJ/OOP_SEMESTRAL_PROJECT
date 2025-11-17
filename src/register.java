import java.util.Scanner;
import java.util.ArrayList;

public class register extends base {
    public void start() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the register program");
        String name = sc.nextLine();
        item_name.add(name);

        System.out.println(item_name);
    }

}
