public class App {

    static void compare(int check){
        if(check==1){
            System.out.println("rectangles are equal");
        }
        else 
            System.out.println("rectangles are not equal");
    }
    public static void main(String[] args) throws Exception {
        Rectangle[] rectangles ={
            new Rectangle(3,4),
            new Rectangle(2,8),
            new Rectangle(4,3),
            new Rectangle(7,5),
            new Rectangle(4,4)
        };

        for(int i=0;i<5;i++){
            System.out.println("RECTANGLE "+ (i+1));
            System.out.println(rectangles[i]);
            System.out.println();
        } 

        System.out.println("RECTANGLE 1 compare RECTANGLE 2");
        compare(rectangles[0].compareTo(rectangles[1]));

        System.out.println("RECTANGLE 1 compare RECTANGLE 3");
        compare(rectangles[0].compareTo(rectangles[2]));

        System.out.println("RECTANGLE 2 compare RECTANGLE 5");
        compare(rectangles[1].compareTo(rectangles[4]));
    }
}
