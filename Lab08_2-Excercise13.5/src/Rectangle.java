public class Rectangle extends GeometricObject{
    private double width,height;
    Rectangle(){

    }
    Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    Rectangle(double width,double height,String color,boolean filled){
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
    public int compareTo(GeometricObject o) {
        if(getArea()==o.getArea()){
            return 0;
        }
        else if(getArea()>=o.getArea()){
            return 1;
        }
        else return -1;
    }


    @Override
    public String toString() {
        return "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

    @Override
    public String getDetails(){
        return Double.toString(this.getWidth())+" , "+Double.toString(this.getHeight());
    }

}
