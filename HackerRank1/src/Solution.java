import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int q = 0; q < t; q++){
            System.out.println("got here");
            char[] word = s.next().toCharArray();
            for (int i = 1; i < word.length; i++){
                if (word[i] - word[i - 1] != word[word.length - i] - word[word.length - i - 1]){
                    System.out.println("Not Funny");
                    break;
                }
            }
            System.out.println("Funny");
        }

    }
}