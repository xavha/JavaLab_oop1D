public class App {
    static void compare(int check){
        if(check==1){
            System.out.println("octagons are equal");
        }
        else 
            System.out.println("octagons are not equal");
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5,"blue",true);
        System.out.println("OCTAGON 1");
        System.out.println(octagon1);
        
        Octagon octagon2 = new Octagon(8,"pink",false);
        octagon2 = (Octagon)octagon1.clone();
        System.out.println("OCTAGON 2");
        System.out.println(octagon2);

        System.out.println("COMPARE OCTAGON");
        compare(octagon1.compareTo(octagon2));
    }
}
