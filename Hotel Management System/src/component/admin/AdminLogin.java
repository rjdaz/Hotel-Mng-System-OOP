package component.admin;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;

import java.util.Scanner;
import clearConsole.clr;

public class AdminLogin {


  public AdminLogin(Scanner scanner, clr clear) {
    Path file = Paths.get("admin.txt"); // adjust path if needed

    try{
      
    }

    clear.console();
    System.out.println("===========================================");
    System.out.println("                Admin Login");
    System.out.println("-------------------------------------------");
    System.out.print("        Username: ");
    String username = scanner.next();
    System.out.print("        Password: ");
    String password = scanner.next();





    // Validate credentials (this is just a simple example)
    if (username.equals("admin") && password.equals("password")) {
      System.out.println("Login successful! Proceeding to the next module...");
      new component.staff.StaffLogin(scanner, clear);
    } else {
      System.out.println("Invalid username or password.");
    }
  }
}
