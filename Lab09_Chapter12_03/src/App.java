import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i=1;i<=1000;i++){
            inputData(i);
        }
        readFile();
    }
    public static void readFile(){
        
        try {
            File file = new File("Salary.txt");
            Scanner read = new Scanner(file);
            int[] numofrank = {0,0,0};
            double[] totalsalary = {0,0,0};
            while(read.hasNextLine()){
                String data = read.nextLine();
                String[] splStrings = data.split(" ",4);
                //System.out.println(splStrings[2]);

                double salary = Double.parseDouble(splStrings[3]);
                if(splStrings[2].equals("assistant")){
                    numofrank[0]++;
                    totalsalary[0]+=salary;
                }
                else if(splStrings[2].equals("associate")){
                    numofrank[1]++;
                    totalsalary[1]+=salary;
                }
                else{
                    numofrank[2]++;
                    totalsalary[2]+=salary;
                }
            }
            read.close();
            double avg = (totalsalary[0]+totalsalary[1]+totalsalary[2])/1000.0;

            System.out.println("Total salary for assistant professor is "+Math.round((totalsalary[0]*100.0)/100.0));
            System.out.println("Total salary for associate professor is "+Math.round(totalsalary[1]*100.0)/100.0);
            System.out.println("Total salary for full professor is "+Math.round(totalsalary[2]*100.0)/100.0);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Average salary for assistant professor is "+Math.round(totalsalary[0]/numofrank[0]*100.0)/100.0);
            System.out.println("Average salary for associate professor is "+Math.round(totalsalary[1]/numofrank[1]*100.0)/100.0);
            System.out.println("Average salary for full professor is "+Math.round(totalsalary[2]/numofrank[2]*100.0)/100.0);
            System.out.println("Average salary for all professors is "+Math.round(avg*100.0)/100.0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
//rank={"assistant","associate","full"};