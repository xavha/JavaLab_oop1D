import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ip = new Scanner(System.in);

        System.out.print("Creating circle 1, input radius: ");
        double c1,c2;
        c1=ip.nextDouble();
        System.out.print("Creating circle 2, input radius: ");
        c2=ip.nextDouble();
        System.out.println("------------------------");

        Circle circle1 = new Circle(c1);
        Circle circle2 = new Circle(c2);
        System.out.print("The max circle's radius is ");
        System.out.println(Circle.max(circle1, circle2).getDetails());
        System.out.println("=========================");

        System.out.print("Creating rectangle 1, input width and height: ");
        double w1,w2,h1,h2;
        w1=ip.nextDouble();
        h1=ip.nextDouble();
        System.out.print("Creating rectangle 2, input width and height: ");
        w2=ip.nextDouble();
        h2=ip.nextDouble();
        System.out.println("------------------------");

        Rectangle r1 = new Rectangle(w1, h1);
        Rectangle r2 = new Rectangle(w2, h2);

        System.out.print("The max rectangle's width and height are: ");
        System.out.println(Rectangle.max(r1, r2).getDetails());
        System.out.println("=========================");

        ip.close();
    }
}
