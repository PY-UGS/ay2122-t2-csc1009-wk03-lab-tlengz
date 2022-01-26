import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //scan for annual interest rate input (double)
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        Double annualInterestRate = input.nextDouble();

        //scan for number of years (int)
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        //scan for loan amount (double)
        System.out.print("Enter loan amount, for example, 120000.95: ");
        Double loanAmount = input.nextDouble();

        input.close();

        //print the loan date, mthly payment, total payment
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", loan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", loan.getTotalPayment()));
    }
    
}
