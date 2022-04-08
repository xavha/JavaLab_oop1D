import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i=1;i<=1000;i++){
            inputData(i);
        }
    }

    public static void inputData(int line) throws FileNotFoundException{
        FileOutputStream file = new FileOutputStream( "Salary.txt" ,true);
        PrintWriter writer = new PrintWriter(file);
            writer.print("FirstName"+line);
            writer.print(" LastName"+line);

            Random rand = new Random();
            int random = rand.nextInt(3);
            String rank = randomRank(random);
            double salary = randomSalary(random);

            writer.print(" "+rank);
            writer.print(" "+salary);
            writer.println();
            writer.close();
    }

    public static String randomRank(int randomrank){
        String[] rank={"assistant","associate","full"};
        return rank[randomrank];
    }

    public static Double randomSalary(int randomsalary){
        Random rand = new Random();
        double salary;
        if(randomsalary==0){
            salary = rand.nextDouble(30000)+50000;
        }
        else if(randomsalary==1){
            salary = rand.nextDouble(50000)+60000;
        }
        else{
            salary = rand.nextDouble(55000)+75000;
        }
        salary = Math.round(salary*100.0)/100.0;
        return salary;
    }
}
