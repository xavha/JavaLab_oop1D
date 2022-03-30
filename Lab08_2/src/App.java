public class App {
    public static void main(String[] args) throws Exception {
        Square[] squareObjects = {
            new Square(4),
            new Square(5),
            new Square(6),
            new Square(7),
            new Square(8),
        };
        
        for(int i=0;i<5;i++){
            System.out.println("SQUARE "+(i+1));
            System.out.println(squareObjects[i]);
            squareObjects[i].howToColor();
            System.out.println();
        }
    }
}
