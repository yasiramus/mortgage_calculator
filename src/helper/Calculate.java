package helper;

//mortgage calculation part 4
import java.text.NumberFormat;
import java.util.Scanner;

public class Calculate {

    //all method in the class are static, they can only
    // access static variable and it accessible to all methods in class
     final static byte PERCENT = 100; // these are called fields
     final static byte MONTHS_IN_YEAR = 12; // a field is a variable we defined at class level

    //this a method for calculating the mortgage only
    //focusing on concept|code that goes together
    public  static String calculateMortgages(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = ( short) (years * MONTHS_IN_YEAR); //converting the entire expression to short

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return NumberFormat.getCurrencyInstance().format(mortgage);

    }

    public  static String calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = ( short) (years * MONTHS_IN_YEAR); //converting the entire expression to short

            double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return NumberFormat.getCurrencyInstance().format(balance);

    }


    //working on repetitive patterns
    public  static double readNumber(
            String prompt,
            double min,
            double max){

        Scanner scanner = new Scanner(System.in);

        double value;

        while (true){
            System.out.print(prompt + ": ");
            value = scanner.nextInt();

//            String readValue = String.valueOf(value);
//            System.out.println("value string: " + readValue);

            if(value > min && value < max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return  value;
    }
}
