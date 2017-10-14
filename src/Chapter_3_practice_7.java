import java.util.Scanner;

/**
 * Created by rohara on 10/12/17. BAC Calculater
 */
public class Chapter_3_practice_7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int numberOfDrinks;
        double ouncesOfAlchohol;
        int weight;
        double bac;

        System.out.println("enter number of drinks");
        numberOfDrinks = keyboard.nextInt();
        System.out.println("enter number of ounces of Alchol per drink");
        ouncesOfAlchohol = keyboard.nextDouble();
        System.out.println("enter weight in pounds");
        weight = keyboard.nextInt();

        bac = (4.136 * numberOfDrinks * ouncesOfAlchohol)/weight;

        if (bac > .08)
        {
            System.out.println("your BAC is " + bac + " Better use Uber");
        }
        else
        {
            System.out.println("your BAC is " + bac + " Keep drinking");
        }


    }
}


