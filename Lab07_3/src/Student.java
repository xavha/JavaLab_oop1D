public class Student extends Person{
    private String status;

    public Student(String name, String address, String phoneNumber, String email, int year) {
        super(name, address, phoneNumber, email);
        this.status = new String("");
        if(year==1)this.status+=Status.FRESHMAN.getStatus();
        else if(year==2)this.status+=Status.SOPHOMORE.getStatus();
        else if(year==3)this.status+=Status.JUNIOR.getStatus();
        else if(year==4)this.status+=Status.SENIOR.getStatus();                 
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Student"+"\n"+
            super.toString()+
            "{" +
            " status='" + getStatus() + "'" +
            "}";
    }


}
