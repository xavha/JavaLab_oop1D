public class SavingAccount extends Account {

    private double amount,balanceBefore;
    private boolean error = false;

    public SavingAccount() {
    }
    //constructor superclass
    public SavingAccount(int id,double balance) {
       super(id, balance);
       this.balanceBefore = getBalance();
    }

    public boolean errorTran(){
        return error;
    }
    
    @Override
    public void withdraw(double withdraw) {
        this.amount=withdraw;
        if(this.getBalance()-withdraw<0||withdraw<0){
           error=true;
        }
        else{
            this.setBalance(this.getBalance()-withdraw);
        }
    }

    @Override
    public String toString() {
        return "Saving Account\n"+"Balance is "+balanceBefore+"\n"+"Withdraw: "+amount+"\n"+"Balance is "+this.getBalance()+"\n"+"This account was created at "+this.getDataCreated();
    }

    
}
