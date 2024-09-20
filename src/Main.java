//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import helper.Calculate;
import helper.Print;

//mortgage calculator continuation part 3 clean coding
public class Main {

    public static void main(String[] args){

        //reading of number|input
        int principal = (int) Calculate.readNumber("Principal", 1000, 1000000);
        float annualInterest = (float) Calculate.readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) Calculate.readNumber("Years ( Period)", 1, 30);

        //printing values
        Print.printMortgage(principal, annualInterest, years);
        Print.printPaymentSchedule(years, principal, annualInterest);
    }

}