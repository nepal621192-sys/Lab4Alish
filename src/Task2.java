import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        double price;
        double priceTotal;

        //Inputs
        System.out.println("Input cost of item");
        price = scan.nextDouble();

        //Calculation
        priceTotal = price * 1.05;

        //Outputs
        System.out.println("The cost of the item is $" + price + " and with 5% tax, the total is $" + priceTotal);
    }
}
