package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double numOfMiles;
        double gallonsOfGas;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles: ");
        numOfMiles = input.nextDouble();
        System.out.println("Enter the amount of gas consumed in gallons");
        gallonsOfGas = input.nextDouble();

        milesPerGallon = numOfMiles / gallonsOfGas;
        System.out.println("Miles per gallon is: " + milesPerGallon);
    }
}
