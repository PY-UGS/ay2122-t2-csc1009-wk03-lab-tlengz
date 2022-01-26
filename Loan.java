import java.util.Date;
import java.lang.Math;

public class Loan {
    private Double annualInterestRate;
    private Integer numberOfYears;
    private Double loanAmount;
    private Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000.0;
        this.loanDate = new Date();
    }

    public Loan(Double annualInterestRate, Integer numberOfYears, Double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public Double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Integer getNumberOfYears(){
        return numberOfYears;
    }

    public Double getLoanAmount(){
        return loanAmount;
    }

    public Date getLoanDate(){
        return loanDate;
    }

    public void setAnnualInterestRate(Double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(Integer numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(Double loanAmount){
        this.loanAmount = loanAmount;
    }

    public Double getMonthlyPayment(){
        // interests is in %, 1 year = 12 mths
        Double monthlyInterestRate = (annualInterestRate/100)/12;
        
        Double monthlyPayment = (loanAmount*monthlyInterestRate)/(1 - (1/Math.pow((1+monthlyInterestRate), (numberOfYears*12))));
        return monthlyPayment;
    }

    public Double getTotalPayment(){
        Double totalPayment = this.getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
