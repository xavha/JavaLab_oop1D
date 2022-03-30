public class Staff extends Person{
    private String title;


    public Staff(String name, String address, String phoneNumber, String email,String title) {
        super(name, address, phoneNumber, email);
        this.title=title;
    }

    public Staff(){
    }

    public String getTitle() {
        return this.title;
    }


    @Override
    public String toString() {
        return "Staff"+"\n"+
        super.toString()+
        "{" +
            " title='" + getTitle() + "'" +
            "}";
    }
    
}
