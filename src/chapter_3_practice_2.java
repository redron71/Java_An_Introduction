/*
  Created by rohara on 10/12/17.
 */


import java.util.Scanner;

public class chapter_3_practice_2 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int int1, int2, int3;
        System.out.println("Enter three integers.");
        int1 = keyboard.nextInt();
        int2 = keyboard.nextInt();
        int3 = keyboard.nextInt();

        int small, medium, large;

        if ((int1 <= int2) && (int1 <= int3))
        {
           small = int1;
            if ( int2 <= int3 )
            {
                medium = int2;
                large = int3;
            }
            else
            {
                medium = int3;
                large = int2;
            }
        }
        else if ((int2 <= int1) && (int2 <= int3))
        {
            small = int2;
            if (int1 <= int3)
            {
                medium = int1;
                large = int3;
            }
            else
            {
                medium = int3;
                large = int1;
            }
        }
        else
        {
            small = int3;
            if ( int1 <= int2 ) {
                medium = int1;
                large = int2;
            } else {
                medium = int2;
                large = int1;
            }
        }

        System.out.println( "ordered numbers are " + small + "," + medium + "," + large);
    }


}