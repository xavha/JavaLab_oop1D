import java.util.Scanner;
import java.util.Random;

public class S1Q2_64010002 {
    public static void main(String[] args) {
        Random r = new Random();
        String alpha = "abcdefghij";
        StringBuilder buildalpha = new StringBuilder(alpha);
        String num = "0123456789";
        StringBuilder buildnum = new StringBuilder(num);
        int run,mode;
        mode = r.nextInt(2);
        System.out.println("Random Characters are : ");
        if(mode==0){
            for(int i=0;i<5;i++){
                run=r.nextInt(buildalpha.length());
                System.out.print(buildalpha.charAt(run)+" ");
                buildalpha.deleteCharAt(run);
    
                run=r.nextInt(buildnum.length());
                System.out.print(buildnum.charAt(run)+" ");
                buildnum.deleteCharAt(run);
            }
        }
        else{
            for(int i=0;i<5;i++){
                run=r.nextInt(buildnum.length());
                System.out.print(buildnum.charAt(run)+" ");
                buildnum.deleteCharAt(run);

                run=r.nextInt(buildalpha.length());
                System.out.print(buildalpha.charAt(run)+" ");
                buildalpha.deleteCharAt(run);
            }
        }

        System.out.println();

        System.out.println("Select Group of Characters 1:Character 2:Numeric : ");

        Scanner input = new Scanner(System.in);
        int opt;
        opt=input.nextInt();
        
        if(opt==1){
            for(int i=0;i<5;i++){
                System.out.print(buildalpha.charAt(i)+" ");
            }
        }
        else if(opt==2){
            for(int i=0;i<5;i++){
                System.out.print(buildnum.charAt(i)+" ");
            }
        }
        input.close();
    }
}

