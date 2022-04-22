import java.util.Date;

abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
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

    static GeometricObject max(GeometricObject o, GeometricObject o1) {
        if (o.compareTo(o1) == 1)
            return o;
        else
            return o1;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;

    }

    public abstract String getDetails();
}
