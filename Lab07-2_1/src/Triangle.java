public class Triangle extends GeometricObject {
    //private double[] side = new double[3];
    private double side1,side2,side3;
    private double area,s;

    public Triangle(){

    }
    public Triangle(double side1,double side2,double side3,String color,boolean filled){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    @Override
    public double getArea() {
        this.s = (side1+side2+side3)/2;
        this.area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }


    @Override
    public String toString() {
        return "Triangle : \n" +
            "side1 = " + this.side1 +"\n" +
            "side2 = " + this.side2 +"\n" +
            "side3 = " + this.side3 +"\n" +
            "color = " + super.getColor() +"\n" +
            "isfilled = " + super.isFilled() +"\n" +
            "AREA = " + getArea() +"\n" +
            "PERIMETER = " + getPerimeter() +"\n" 
            ;
    }


}
