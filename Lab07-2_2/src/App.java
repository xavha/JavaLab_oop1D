public class App {
    public static void main(String[] args) throws Exception {
        Account test = new Account("George",1122,1000);
        test.setAnnualInterestRate(1.5);
        test.deposit(30);
        test.deposit(40);
        test.deposit(50);
    
        test.withdraw(5);
        test.withdraw(4);
        test.withdraw(2);
    
        System.out.println(test.toString());
    }
}
