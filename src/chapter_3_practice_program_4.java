import java.util.Scanner;

/**
 * Created by rohara on 10/14/17.
 */
public class chapter_3_practice_program_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sentence;
        int stringLength;
        System.out.println("Enter a sentence");
        sentence = keyboard.nextLine();
        stringLength = sentence.length();

        if ( sentence.lastIndexOf("?") == (stringLength - 1) )
        {
            if ( (stringLength % 2) == 0 )
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else if ( sentence.lastIndexOf("!") == (stringLength - 1) )
        {
            System.out.println("Wow");
        }
        else
        {
                System.out.println("You always say " + "\"" + sentence + "\"");
        }
    }
}