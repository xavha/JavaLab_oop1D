public class Rectangle extends GeometricObject{
    private double width,height;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

}
