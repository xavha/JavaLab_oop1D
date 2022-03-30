public class Square extends GeometricObject implements Colorable{
    private double side;
    Square(){

    }

    Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
    

    @Override
    public String toString() {
        return 
            "Area = " + getArea() ;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

}
