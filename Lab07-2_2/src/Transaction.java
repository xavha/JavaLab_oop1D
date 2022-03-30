import java.util.Date;
public class Transaction {
    private char type;
    private double amount,balance;
    private String description;
    private Date dateCreated;


    public Transaction(){
        this.dateCreated = new Date(); 
    }
    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.dateCreated = new Date(); 
    }
    
    public void withdraw(double withdraw){
        this.balance-=withdraw;
    }
    public void deposit(double deposit){
        this.balance+=deposit;
    }

    public char getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDataCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return dateCreated+"\t\t"+type+"\t\t"+amount+"\t\t"+balance+"\n";
    }

}
