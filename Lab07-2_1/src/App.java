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

        Circle circle = new Circle(7,"blue",false);
        System.out.println(circle.displayObject(circle));
        System.out.println();

        System.out.println(triangle.displayObject(triangle));
        System.out.println();

        Rectangle rectangle = new Rectangle(34, 12, "yellow", true);
        System.out.println(rectangle.displayObject(rectangle));

        ip.close();
        ipstring.close();
    }
}
