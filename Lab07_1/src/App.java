public class App {
    public static void main(String[] args) {
        SavingAccount A = new SavingAccount(1,5000);
        A.withdraw(3000);
        if(A.errorTran()){
            System.out.println("Error Transactions");
        }
        else{
            System.out.println(A.toString());             
        }
        System.out.println();
        SavingAccount B = new SavingAccount(2,5000);
        B.withdraw(10000);
        if(B.errorTran()){
            System.out.println("Error Transactions");
        }
        else{
            System.out.println(B.toString());             
        }

        System.out.println();
        CheckingAccount C = new CheckingAccount(3,5000);
        C.withdraw(8000);
        if(C.overdraft()){
            System.out.println("Overdraft Limit");
        }
        else{
            System.out.println(C.toString());             
        }
        System.out.println();
        SavingAccount D = new SavingAccount(4,5000);
        D.withdraw(12000);
        if(D.errorTran()){
            System.out.println("Overdraft Limit");
        }
        else{
            System.out.println(D.toString());             
        }
    }
}
