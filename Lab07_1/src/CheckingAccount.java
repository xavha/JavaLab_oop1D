public class CheckingAccount extends Account {
    private int OverdraftLimit = 5000;
 
    private double amount,balanceBefore;
    private boolean error = false;
    public CheckingAccount() {
    }

    public CheckingAccount(int id,double balance) {
       super(id, balance);
       this.balanceBefore = getBalance();
    }

    public boolean overdraft(){
        return error;
    }
   
    @Override
    public void withdraw(double withdraw) {
        this.amount=withdraw;
        if(this.getBalance()+OverdraftLimit-withdraw<0){
            error = true;
        }
        else{
            this.setBalance(this.getBalance()-withdraw);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount\n"+"Balance is "+balanceBefore+"\n"+"Withdraw: "+amount+"\n"+"Balance is "+this.getBalance()+"\n"+"This account was created at "+this.getDataCreated();
    }

}
