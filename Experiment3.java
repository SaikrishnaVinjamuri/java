
class SavingsAccount{
    private static double annualInterestRate;
    private double savings;

    public SavingsAccount(){}
    public SavingsAccount(double savings){
        this.savings=savings;
    }

    public void setSavings(double savings){
        this.savings = savings;
    }
    public void setAnnualInterestRate( double annualInterestRate){
        this.annualInterestRate= annualInterestRate;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = annualInterestRate/12 ;
        return savings*monthlyInterest;
    }
}


public class Experiment3 {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);
        account1.setAnnualInterestRate(4);
        account2.setAnnualInterestRate(4);
        System.out.println("Monthly Interest of $2000 when annual rate 4%= " + account1.calculateMonthlyInterest());
        System.out.println("Monthly Interest of $3000 when annual rate 4% = " + account2.calculateMonthlyInterest());
        account1.setAnnualInterestRate(5);
        account2.setAnnualInterestRate(5);
        System.out.println("Monthly Interest of $2000 when annual rate 5% = " + account1.calculateMonthlyInterest());
        System.out.println("Monthly Interest of $3000 when annual rate 5% = " + account2.calculateMonthlyInterest());

    }

}
