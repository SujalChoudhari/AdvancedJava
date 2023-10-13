
/**
 * You are given n pairs of strings.
 *  
 * Two pairs (a,b) and (c,d) are identical if a=c and b=d.
 *  That also implies (a,b) is not same as (b,a).
 *  After taking each pair as input, you need to print a number of unique pairs you currently have.
 *  Print n lines.
 *  In the ith line, print number of unique pairs you have after taking  ith pair as input.
 *  
 */

import java.util.*;

public class Three {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Inputs:");
        int size = Integer.parseInt(sc.nextLine());
        while (size-- > 0) {
            set.add(sc.nextLine());
            System.out.println("Total No of unique Inputs: " + set.size());
        }


    }
}