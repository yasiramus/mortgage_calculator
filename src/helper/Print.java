package helper;

public class Print {

    public static void printMortgage(int principal, float annualInterest, byte years) {

        String mortgage = Calculate.calculateMortgages(principal, annualInterest, years);

        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("-----------");
        System.out.println("Monthly Payment: " + mortgage);
    }

    public static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------");
        for (short month = 0; month <= (years * Calculate.MONTHS_IN_YEAR); month++) {
            String PAYMENT_SCHEDULE = Calculate.calculateBalance(principal, annualInterest, years, month);
            System.out.println(PAYMENT_SCHEDULE);
        }
    }
}
