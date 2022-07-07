## Lab - 6 [Run Length Encoding in Java]

### Objective

- To create an algorithm to get the run length encoding of given string

### Theory / Procedure

- Run length encoding is an encoding technique that uses the length of characters in a String to encode the string.
- For example say we have a string `wwweerrtss` then the encoded output will be `w3e2r2t1s2` as we can see the encoded output has numbers assigned as the length of corresponding characters.

- Steps to create a Run length encoding:
    1. Get string from user
    1. Then we loop through the characters of the given string.
    2. Then loop through each characters and count the length
    3. Print the character and length repeatedly.

### Source code

```java
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
      System.out.println("Enter a String: ");
      String str = sc.nextLine();
      encoding(str);
    }
    encoding(str);
  }
}
```

### Conclusion

- Created an algorithm to encode given string with Run Length Encoding technique

### Output

```bash
Enter a string: 
aaabbcccccddww
a3b2c5d2w2
```