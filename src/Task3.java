import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //Vars
        double winterCost;
        double springCost;
        double summerCost;
        double fallCost;
        double sumCost;
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("Winter maintenance cost?");
        winterCost = scan.nextDouble();
        System.out.println("Spring maintenance cost?");
        springCost = scan.nextDouble();
        System.out.println("Summer maintenance cost?");
        summerCost = scan.nextDouble();
        System.out.println("Fall maintenance cost?");
        fallCost = scan.nextDouble();

        //Calculations
        sumCost = winterCost + springCost + summerCost + fallCost;

        //Outputs
        System.out.println("The total yearly cost is $" + sumCost);
    }
}
