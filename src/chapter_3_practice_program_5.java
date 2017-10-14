import java.util.Scanner;

/**
 * Created by rohara on 10/14/17.
 */
public class chapter_3_practice_program_5 {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String tempType;
    double temperature;
    double degrees_c;
    double degrees_f;
    System.out.println("Enter a temperature");
    temperature = keyboard.nextInt();

    System.out.println("enter C for Celcius or F for Fahrenheit");
    tempType = keyboard.next();

    if (tempType.equalsIgnoreCase("C"))
    {
        degrees_f = temperature * (9.0 / 5.0) + 32;
        System.out.print(temperature + " degrees Celcius = " + degrees_f + " degrees Fahrenheit");
    }
    else if (tempType.equalsIgnoreCase("F"))
    {
        degrees_c = ((temperature - 32) * (5.0/9.0));
        System.out.print(temperature + " degrees Fahrenheit = " + degrees_c + " degrees Celcius");
    }
    else
    {
        System.out.println("Temperature Type must be C or F");
    }
}
}
