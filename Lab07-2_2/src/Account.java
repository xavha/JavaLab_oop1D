import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

public class Account {
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;

    private String name;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    public Account(){
    }
    public Account(int id,double balance){
        this.dateCreated = new Date();
        this.id=id;
        this.balance=balance;
    }
    public Account(String name,int id,double balance){
        this.dateCreated = new Date();
        this.name=name;
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
        return  "Name: "+name+"\n"+
                "Account ID: "+id+"\n"+
                "Annual interest rate: "+annualInterestRate+"\n"+
                "Balance: "+balance+"\n"
                +Arrays.toString(transactions.toArray());
    }
    //method
    public double getMonthlyInterestRate(){
        return this.annualInterestRate;
    }
    public double getMonthlyInterest(){
        return this.balance* this.annualInterestRate/100;
    }
    public void withdraw(double withdraw){
        if(this.balance-withdraw>=0){
            this.balance-=withdraw;
            this.transactions.add(new Transaction('W',withdraw, balance,""));
        }
        else{
            System.out.println("ERROR");
        }
    }
    public void deposit(double deposit){
        this.balance+=deposit;
        this.transactions.add(new Transaction('D',deposit, balance,""));
    }
}

