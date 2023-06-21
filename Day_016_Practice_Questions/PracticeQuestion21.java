// WAP to find out the type of website from the url
// .com -> commercial website
// .org -> organization website
// .in -> Indian website
package Day_016_Practice_Questions;

import java.util.Scanner;

public class PracticeQuestion21 {
    public static void main(String[] args) {
        System.out.println("Program to find out the type of website :");
        System.out.println("Please enter your website url :");
        Scanner sc = new Scanner(System.in);
        String url = sc.next();
        if (url.equals(".com")) {
            System.out.println("Commercial website");
        } else if (url.equals(".org")) {
            System.out.println("Organization website");
        } else if (url.equals(".in")) {
            System.out.println("Indian website");
        } else {
            System.out.println("Please give valid input.");
        }
        sc.close();
    }
}
