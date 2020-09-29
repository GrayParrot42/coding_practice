//ch. 5; 5.51
package Week2;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = input.nextLine();

        System.out.println(getLargestSubString(s1,s2));
    }

    static String getLargestSubString(String s1, String s2) {
        String shortest = "";
        String longest = "";

        //s1 longer than s2
        if (s1.length() > s2.length()) {
            longest = s1;
            shortest = s2;
            //s1 shorter than s2
        } else if (s1.length() < s2.length()) {
            longest = s2;
            shortest = s1;
        } else if (s1.equals(s2)) {
            //return s1;
            return s1;
        } else {
            longest = s1;
            shortest = s2;
        }
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i <= shortest.length(); i++) {
            for (int j = i; j <= shortest.length(); j++) {
                String sub = shortest.substring(i,j);
                substrings.add(sub);
            }
        }
        int size = 0;
        String temp = "";
        for (int k = 0; k < substrings.size(); k++) {
           if (longest.contains(substrings.get(k))
                   && substrings.get(k).length() > size) {
               temp = substrings.get(k);
               size = temp.length();
           }
        }
        return temp;
    }
}
