import java.util.Scanner;

import clearConsole.clr;

public class App {
    // globalize the scanner
    public static final Scanner scanner = new Scanner(System.in);

    //globalize the clear console
    public static final clr clear = new clr();
    
    public static void main(String[] args) throws Exception {
        // home page
        clear.console();
        System.out.println("===========================================");
        System.out.println("        Hotel Management System!");
        System.out.println("                Welcome!!\n");
        System.out.println("        [1] Admin");
        System.out.println("        [2] Staff");
        System.out.print("        Choose a number: ");
        int selectedNumber = scanner.nextInt();

        switch (selectedNumber) {
            case 1:
                new component.admin.AdminLogin(scanner, clear);
                break;
            case 2:
                new component.staff.StaffLogin(scanner, clear);
                break;
            default:
                System.out.println("        Incorrect select number!!");
                scanner.nextLine(); // consume the newline character
                System.out.print("        Press Enter to continue...");
                scanner.nextLine();
                main(args);
                break;
        }
    }
}
