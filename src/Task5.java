import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        double tempF;
        double tempC;

        //Inputs
        System.out.println("What is the temperature in Fahrenheit?");
        tempF = scan.nextDouble();

        //Calculations
        tempC = (tempF - 32) * ((double) 5 / 9);

        //Outputs
        System.out.println(tempF + "°F is equal to " + tempC + "°C");
    }
}
