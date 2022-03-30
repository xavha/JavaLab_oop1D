public class Octagon extends GeometricObject implements Comparable,Cloneable{
    private double side;
    Octagon(){

    }
    Octagon(double side){
        this.side = side;
    }
    Octagon(double side,String color,boolean filled){
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2+(4/22))*side*side;
    }

    @Override
    public double getPerimeter() {
        return side*8;
    }

    @Override
    public int compareTo(Octagon o) {
        if(getArea()==o.getArea()){
            return 1;
        }
        else return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return 
            " side = " + getSide() + "\n" +
            " color = " + super.getColor() + "\n" +
            " isFilled = " + super.isFilled() + "\n" +
            " Area = " + getArea() + "\n" +
            " Perimeter = " + getPerimeter() + "\n" 
            ;
    }

}
