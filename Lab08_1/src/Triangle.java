public class Triangle extends GeometricObject {
    private double[] side = new double[3];
    private double area,s;
    Triangle(){

    }
    Triangle(double[] side,String color,boolean filled){
        super(color,filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        this.s = (side[0]+side[1]+side[2])/2;
        this.area = Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
        return area;
    }

    @Override
    public double getPerimeter() {
        return side[0]+side[1]+side[2];
    }


    @Override
    public String toString() {
        return "{" +
            " Area = '" + getArea() + "'" +
            ", Perimeter = '" + getPerimeter() + "'" +
            ", Color = '" + getColor() + "'" +
            ", Filled = '" + isFilled() + "'" +
            "}";
    }


}
