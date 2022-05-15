public class BMI {
    private String name;
    private int age;
    private double weight,height,feet,inches; 
    private double bmi;
    public BMI(){
    }
    public BMI(String name, int age, double weight,double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        // this.feet = feet;
        // this.inches = inches;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public double getBMI(){
        this.feet+=inches;
        this.bmi = weight/(height*height);
        return bmi;
    }

    public double getmeter(){
        this.feet*=0.3048;
        this.inches*=0.0254;
        return feet+inches;
    }

    public String getStatus(){
        if(bmi<18.5){
            return "Underweight";
        }
        else if(bmi<25){
            return "Normal weight";
        }
        else if(bmi<30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", weight='" + getWeight() + "'" +
            ", height='" + getHeight() + "'" +
            ", BMI='" + getBMI() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
