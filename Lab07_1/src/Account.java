import java.util.Date;

public class Account {
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;

    public Account(){
    }
    public Account(int id,double balance){
        this.dateCreated = new Date();
        this.id=id;
        this.balance=balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return this.dateCreated;
    }
    @Override
    public String toString(){
        return "Account [ID : "+id+" BALANCE : "+balance+" MonthlyInterest : "+getMonthlyInterest()+" AccountCreated : "+getDataCreated()+" ]";
    }
    //method
    public double getMonthlyInterestRate(){
        return this.annualInterestRate;
    }
    public double getMonthlyInterest(){
        return this.balance* this.annualInterestRate/100;
    }
    public void withdraw(double withdraw){
        this.balance-=withdraw;
    }
    public void deposit(double deposit){
        this.balance+=deposit;
    }
}

