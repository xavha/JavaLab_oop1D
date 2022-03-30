import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ipdouble = new Scanner(System.in);
        Scanner ipstring = new Scanner(System.in);
        Scanner ipbool = new Scanner(System.in);
        double[] side={0,0,0};

        for(int i=0;i<3;i++){
            System.out.println("input "+(i+1)+" side : ");
            side[i] = ipdouble.nextDouble();
        }

        System.out.println("input Color : ");
        String color = ipstring.nextLine();

        System.out.println("isFilled : ");
        boolean filled = ipbool.nextBoolean();
        Triangle A = new Triangle(side,color,filled);

        System.out.println(A);
        ipdouble.close();
        ipbool.close();
        ipstring.close();
    }
}
