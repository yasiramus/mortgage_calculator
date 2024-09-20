//import java.text.NumberFormat;

//import java.security.Principal;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Locale;
//import java.util.Scanner;

//public class PracticeFile {

////       final double AGE = 89.87;
////        System.out.println(AGE);

////        implicit casting \ automatically conversion or casting
////        short x = 1;
////        int y = x+2;
////        System.out.println(y);
////        implicit casting happens when ever we are not going to lose data
////        in this case there isn't any data lose
////        double x = 1.1;
//////      double y = x+2;
//////      System.out.println(y);
//
////        explicit casting: manually conversion
////        explicit casting can only happen in compatible types
////        double x = 1.2;
////        int y = (int) x + 2;
////        System.out.println(y);
//
////        to cast not compatible type we use the wrapper classes.
//            Wrapper classes:
////        they are reference types,
////        some wrapper classes are Integer, Short, Float, Long, Byte, Double
//
////        convert string to a  number
////        String k = "1";
////        int z = Integer.parseInt(k)+2;
////        String k = "1.8";/*
////        float z = Float.parseFloat(k)+2f;
////        System.out.println(z);*/
//                number to string
//                    String.valueOf(z)

////        formatting numbers as currency values
////        NumberFormat currency = NumberFormat.getCurrencyInstance();
////         method chaining:chaining multiple methods together
////        String result = NumberFormat.getPercentInstance().format(0.6);
//////        System.out.println(result);
//
////        Scanner scanner = new Scanner(System.in);
//////        System.out.print("Enter your name :" );
////        String name = scanner.nextLine().trim();
////        System.out.println("You are " + name);
////    }
////}
//
////public class Main {
////    public static void main(String[] args){
////        final byte PERCENT = 100;
////        final byte MONTHS_IN_YEAR = 12;
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Principal: ");
////        int principal = scanner.nextInt();
////
////        System.out.print("Annual Interest Rate: ");
////
////        float annualInterestRate = scanner.nextFloat();
////        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
////
////        System.out.print("Years in Period: ");
////        byte numberOfYears = scanner.nextByte();
////
////        double mortgage = principal * (monthlyInterestRate  * Math.pow(1 + monthlyInterestRate, numberOfYears))
//                          / (Math.pow(1 + monthlyInterestRate, numberOfYears) - 1 );
////
////        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
////        System.out.println("Mortgage: " + mortgageFormatted);
////
////    }
////}
//
//public class Main {
//    public static void main (String[] args){
//
//        final byte percentage = 100;
//        final byte monthInYear = 12;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Principal : ");
////        int principal = scanner.nextInt();
//        System.out.print("Interest rate in month : ");
//
////        double annualInterestRate = scanner.nextDouble();
////        double monthlyInterest = annualInterestRate / percentage / monthInYear;
//
//        System.out.print("Years in period : ");
//
////        byte years = scanner.nextByte();
////        int numberOfPayments = years * monthInYear;
//
////        double mortgage = getMortgages(principal, monthlyInterest, numberOfPayments);
////
//////        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
//////        System.out.print(mortgageFormated);
//
//    }
//
//    private static double getMortgages(int principal, double monthlyInterest, int numberOfPayments) {
//        double mortgages = principal
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//            return mortgages;
//    }
//}


//control flow(19 august 2024)
// comparison (==, != >=, >, <, <=) return a boolean value.
// logical operator (&&, ! || ) used with multiple boolean.
//conditional statement are used when making a decision: if statement, simplifying statement.

//import java.util.Locale;
//import java.util.Scanner;

//    public class Main {
//        public static void main(String[] args){
//        comparison operator (==, != >=, >, <, <=)
//        equality operator
//            int x = 1;
//            int y = 1;
//        System.out.println(x == y); //true

//        Inequality operator
//        System.out.println(x!= y); // false

//        greater than  | greater than and equal to : >=
//        less than and equal to <=
//        comparison operator ends

//    a boolean expression always produces a boolean value

//        logical operator start : &&, ||, ! (use to reverse a value
//    int temperature = 22;
//    boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        || operator ! operator
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = false;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

//        conditional statement: if statement
//        is temp is greater than 30
//        it a hot day
//        drink plenty of water
//        otherwise if it between 20 and 30
//        it a nice day
//        otherwise
//        it's cold.

//        temps declare a boolean variable called temp set it a default value
//                byte temp = 3;
//            if(temp > 30){
//                System.out.println("It a hot day");
//                System.out.println("Drink plenty of water");
//            }
//            else if(temp >= 20) System.out.println("It a nice day");
//            else System.out.println("it cold");
//        simplifying if statement
//            int income = 120_000;
//            boolean hasHighIncome = (income > 100_000);//boolean
//        if (income > 100_000) hasHighIncome = true;
//        else hasHighIncome = false;
//        System.out.println(hasHighIncome);
//        ternary operator// this a string
//            Strings className = (income > 100_000) ? "First" : "Economy";
//        System.out.println(className);

//        Switch statement execute diff part of code depending on the value or expression
//            String role = "admin";

//        switch (role){
//            case "admin":
//                System.out.println("Your are admin");
//                break;
//
//            case "moderator":
//                System.out.println("Your are a moderator");
//                break;
//
//            default:
//                System.out.println("Your are guest");
//        }

            // exercise
            //fizzbuzz
//            Scanner scanner = new Scanner(System.in);
//        System.out.print("enter a number: ");
//
//        int input = scanner.nextInt();
//        if (input % 5 == 0 && input % 3 == 0)
//            System.out.println("fizzBuzz");
//        else if (input % 5 == 0)
//            System.out.println("fizz");
//        else if (input % 3 == 0)
//            System.out.println("buzz");
//        else
//            System.out.println(input);

//        while loop:use when we don't know the number of times we want to execute a task
//            String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }

//        do while loop get executed at least once
//        do{
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));

//        break and continue  break: terminate/jump out the loop
//        continue:moves control to the start of the loop
//        while (true){ //simplifying to the short form by replacing the condition(!input.equals("quit")) statement with true
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        for each loop iterate over array or a collection
//            String[] fruits = {"Apple", "Mango", "Orange", "Pawpaw", "lemon"};
//        for loop

// benefit can be iterated both forward and backward also index number and item can be access
//        for(int i = 0; i < fruits.length; i++)//forward
//            System.out.println(fruits[i]);
//        backward
//           for (int i = fruits.length; i > 0; i--) {
//               System.out.println(fruits[i]);
////               error in here check it out later
//           }


//        for(String fruit : fruits)//for each loop
//            System.out.println(fruit); //limitations: forward only:array can't be iterated from the end to the beginning,
//
//            individual index numbers can't be access,

//        mortgage calculator continuation part 2
//            final byte percentage = 100;
//            final byte monthInYear = 12;
//            int principal = 0;
//
//            while (true){
//                System.out.print("Principal : ");
//                principal = scanner.nextInt();
//
//                if(principal > 1_000 && principal < 1000_000)
//                    break;
//                System.out.println("Enter a number between 1000 to 1000, 000");
//            }
//
//            double annualInterestRate = 0;
//            double monthlyInterest =0;
//
//            while (true){
//                System.out.print("Interest rate(Annual) : ");
//                annualInterestRate = scanner.nextDouble();
//                if (annualInterestRate > 0 && annualInterestRate <= 100){
//                    monthlyInterest = annualInterestRate / percentage / monthInYear;
//                    break;
//                }
//                System.out.println("Enter a number between 1 to 30");
//            }
//
//            byte years = 0;
//            int numberOfPayments = 0;
//
//            while (true){
//                System.out.print("Years(Period) : ");
//                years = scanner.nextByte();
//                if (years > 0 && years <= 30){
//                    numberOfPayments = years * monthInYear;
//                    break;
//                }
//                System.out.println("Enter a number between 1 to 30");
//
//            }
//
//            double mortgage = principal
//                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//            String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
//            System.out.print(mortgageFormated);
//
//        }
//
//    }
//


//CREATING NEW METHODS
//public static String greetUser(String firstName, String lastName){
//    return ("Hello " + firstName + " " +  lastName);
//}

//    refactoring :changing the structure of our code without changing it behaviour
//    5 to 10 lines
//1. concept or lines of code that goes together
//    2. repetitive patterns
//}
