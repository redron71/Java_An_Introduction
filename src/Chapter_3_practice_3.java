/*
  Created by rohara on 10/12/17. find the string in the middle ordered lexicographically
 */
import java.util.Scanner;


public class Chapter_3_practice_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String s1, s2, s3;
        System.out.println("Enter three strings.");
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        s3 = keyboard.nextLine();

        if ( (s1.compareTo(s2) < 0) && (s2.compareTo(s3) < 0) )
            System.out.println(s2 + " is the midle string lexicographically");
        else if ( (s2.compareTo(s1) < 0) && (s1.compareTo(s3) < 0) )


            System.out.println(s1 + " is the midle string lexicographically");

        else if ( (s1.compareTo(s3) < 0) && (s3.compareTo(s2) < 0) )


            System.out.println(s3 + " is the midle string lexicographically");


    }
}
