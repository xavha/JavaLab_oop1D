import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //BMI user = new BMI();
        String name; 
        int age; 
        double weight,height;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter name and age : ");
        name = ip.next();
        age = ip.nextInt();

        boolean kg=false ,meter=false;
        System.out.println("Weight (input format: 1=kg 2=pound value) : ");
        if(ip.nextInt()==1){
            kg=true;
        }
        if(!kg){
            weight=ip.nextDouble()*0.45359237;
        }
        else weight=ip.nextDouble();

        System.out.println("Height (input format: 1=meter 2=feet-inch): ");
        if(ip.nextInt()==1){
            meter=true;
        }
        if(!meter){
            height=ip.nextDouble()*0.3048;
            height+=ip.nextDouble()*0.0254;

        }
        else height=ip.nextDouble();

        BMI user = new BMI(name,age,weight,height);

        //System.out.println("Your BMI : "+user.counting());
        System.out.format("Your BMI : "+"%.2f"+"\n",user.getBMI());
        System.out.println("Interpretation : "+user.getStatus());

        ip.close();
    }
}
