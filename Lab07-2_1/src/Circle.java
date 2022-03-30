public class Circle  extends GeometricObject{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }


    @Override
    public String toString() {
        return "Circle : " +"\n" +
            " AREA = " + getArea() + "\n" +
            " PERIMETER = " + getPerimeter() + "\n" ;
    }

}
