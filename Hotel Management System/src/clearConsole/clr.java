package clearConsole;

public class clr {
  public static void console() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
