import java.util.Date;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com");
        System.out.println(person.toString());

        System.out.println();
        Student student = new Student("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
        "012-345-6789", "somsak@mymail.com",1);
        System.out.println(student.toString());

        System.out.println();
        Employee employee = new Employee("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com", "office",25000,new Date());
        System.out.println(employee.toString());   

        System.out.println();
        Faculty faculty = new Faculty("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520"
            , "012-345-6789", "somsak@mymail.com",8,2);
        System.out.println(faculty.toString());

        System.out.println();
        Staff staff = new Staff("Somsak", "1 Chalongkrung Road, Ladkrabang, BKK, 10520", 
            "012-345-6789", "somsak@mymail.com","title");
        System.out.println(staff.toString());

    }
}
