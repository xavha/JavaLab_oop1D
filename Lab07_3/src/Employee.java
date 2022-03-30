import java.util.Date;

public class Employee extends Person{

    private String office;
    private double salary;
    private Date date_hired;


    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String email,String office,double salary,Date date_hired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }


    public String getOffice() {
        return this.office;
    }


    public double getSalary() {
        return this.salary;
    }


    public Date getDate_hired() {
        return this.date_hired;
    }

    @Override
    public String toString() {
        return "Employee"+"\n"+
        super.toString()+
         "{" +
            " office='" + getOffice() + "'" +
            ", salary='" + getSalary() + "'" +
            ", date_hired='" + getDate_hired() + "'" +
            "}";
    }


}
