import java.util.Date;

abstract class GeometricObject {
    private String color,display;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){

    }
    protected  GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String displayObject(Object object){
        display = "Color : " + this.getColor() +
        "\nisFilled : " + this.isFilled();
        if(object instanceof Circle){
            return  display + "\nArea : " + ((Circle)object).getArea() + 
            "\nPerimeter : " + ((Circle)object).getPerimeter() +
            "\nDiameter : " + ((Circle)object).getRadius()*2;
        }
        else if(object instanceof Triangle){
            return display + "\nArea : " + ((Triangle)object).getArea() + 
            "\nPerimeter : " + ((Triangle)object).getPerimeter() +
            "\nSide : " + ((Triangle)object).getSide1() + " , " + 
            ((Triangle)object).getSide2() + " , " + ((Triangle)object).getSide3();            
        }
        else if(object instanceof Rectangle){
            return display + "\nWidth : "+ ((Rectangle)object).getWidth() +
                    "\nHeight : "+ ((Rectangle)object).getHeight();
        }
        else return "";
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            "}";
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }
}
