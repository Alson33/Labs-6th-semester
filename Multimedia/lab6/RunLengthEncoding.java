package Multimedia.lab6;

import java.util.Scanner;

public class RunLengthEncoding {

  public static void encoding(String str)
  {
    int n = str.length();
    for (int i = 0; i < n; i++) {
      int count = 1;
      while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }

      System.out.print(str.charAt(i) + "" + count);
    }
  }

  public static void main(String[] args)
  {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a string: ");
      String str = sc.nextLine();
      encoding(str);
    }
  }
}
