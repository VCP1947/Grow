import java.util.Scanner;

public class Main {

  /**
   * print string like pyramid.
   */
  public char print(char[] arr, int p) {
    for (int i = 0; i <= p; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();
    ++p;
    if (p == arr.length) {
      return 0;
    } else {
      return print(arr, p);
    }
  }


  /**
   * input from keyboard.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    char[] c = name.toCharArray();
    int p;
    p = 0;
    Main a = new Main();
    a.print(c, p);

  }
}
