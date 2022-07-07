## Lab - 7 [Huffman Coding in Java]

### Objective

- To create an algorithm to output huffman code of given input

### Theory / Procedure

- Huffman coding is a lossless data compression algorithm. The idea is to assign variable-length codes to input characters, lengths of the assigned codes are based on the frequencies of corresponding characters. The most frequent character gets the smallest code and the least frequent character gets the largest code.

- Steps:
    1. Create a node that containes the character and frequency of character along with right and left node.
    2. Create a `PriorityQueue` object of type node we created comparing on basis of frequency using `Comparator` abstract class.
    3. Create a tree like structure using `heap`
    4. Finally print the codes `traversing the tree`

### Source code

```java
import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {

  int data;
  char c;

  HuffmanNode left;
  HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
  public int compare(HuffmanNode x, HuffmanNode y)
  {
    return x.data - y.data;
  }
}

public class HuffmanCoding {
    public static void printCode(HuffmanNode root, String s){
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
        System.out.println(root.c + ":" + s);
        return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args){
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanNode> q
        = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
        HuffmanNode hn = new HuffmanNode();

        hn.c = charArray[i];
        hn.data = charfreq[i];

        hn.left = null;
        hn.right = null;

        q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {

        HuffmanNode x = q.peek();
        q.poll();

        HuffmanNode y = q.peek();
        q.poll();

        HuffmanNode f = new HuffmanNode();

        f.data = x.data + y.data;
        f.c = '-';

        f.left = x;

        f.right = y;

        root = f;

        q.add(f);
        }

        printCode(root, "");
    }
}
```

### Conclusion

- Created an algorithm to calculate the Huffman code for given input

### Output

```c
f:0
c:100
d:101
a:1100
b:1101
e:111
```