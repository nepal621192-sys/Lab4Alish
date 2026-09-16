public class Task1 {
    static void main(String[] args) {
        // Vars
        int intOperandA = 5;
        int intOperandB = 16;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 5.16;
        double doubleOperandB = 61.5;
        double doubleSum;
        double doubleDifference;
        double doubleProduct;
        double doubleQuotient;
        double doubleModulo;

        //Calculations
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //Output
        //Ints
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of " + intOperandA + " and " + intOperandB + " is " + intSum);
        //Doubles
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}
