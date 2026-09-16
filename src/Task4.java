import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        double month1;
        double month2;

        //Calculations
        month1 = 5000 * 1.17;
        month2 = month1 * 1.17;

        //Outputs
        System.out.println("With a starting balance of $5000 and a 17% interest rate.");
        System.out.println("Balance after 2 months: $" + month2);
        System.out.println("Interest after 1 month: $" + (month1 - 5000));
        System.out.println("Interest after 2 months: $" + (month2 - 5000));
    }
}
