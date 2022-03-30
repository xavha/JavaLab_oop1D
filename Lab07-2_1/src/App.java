import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ip = new Scanner(System.in);
        Scanner ipstring = new Scanner(System.in);

        System.out.println("Input SIDE1 : ");
        double side1 = ip.nextDouble();

        System.out.println("Input SIDE2 : ");
        double side2 = ip.nextDouble();

        System.out.println("Input SIDE3 : ");
        double side3 = ip.nextDouble();

        System.out.println("Color : ");
        String color = ipstring.nextLine();

        System.out.println("Isfilled : ");
        boolean filled = ip.nextBoolean();

        Triangle triangle = new Triangle(side1,side2,side3,color,filled);

        System.out.println();
        System.out.println(triangle);

        ip.close();
        ipstring.close();
    }
}
