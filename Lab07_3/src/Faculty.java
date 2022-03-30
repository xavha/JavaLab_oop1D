public class Faculty extends Person{
    private int office_hours,rank;

    public Faculty() {
    }

    public Faculty(String name, String address, String phoneNumber, String email,int office_hours,int rank) {
        super(name, address, phoneNumber, email);
        this.office_hours=office_hours;
        this.rank=rank;
    }

    public int getOffice_hours() {
        return this.office_hours;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return  "Faculty"+"\n"+
        super.toString()+
        "{" +
            " office_hours='" + getOffice_hours() + "'" +
            ", rank='" + getRank() + "'" +
            "}";
    }


}
