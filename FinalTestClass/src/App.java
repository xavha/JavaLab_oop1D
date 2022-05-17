import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Fast Food Restaurant");
        System.out.println("----Let's Order----");
        // System.out.println("How many Pizza Do you want to Order : ");

        Scanner ip = new Scanner(System.in);
        Scanner ipStr = new Scanner(System.in);

        int menu = 0;
        int size = 0;
        ArrayList<Pizza> pizzaOrder = new ArrayList<Pizza>();
        ArrayList<Frenchfries> frenchOrder = new ArrayList<Frenchfries>();

        // System.out.println("[1] : order Pizza");
        // System.out.println("[2] : order Frenchfries");
        // System.out.println("[3] : order Summary");
        // menu = ip.nextInt();

        while (menu != 3) {

            System.out.println();
            System.out.println("[1] : order Pizza");
            System.out.println("[2] : order Frenchfries");
            System.out.println("[3] : order Summary");
            System.out.println();

            menu = ip.nextInt();
            if (menu == 1) {
                System.out.print("Name of menu : ");
                String s = ipStr.nextLine();

                System.out.print("Is Vegetarian (true or false) : ");
                boolean bl = ip.nextBoolean();

                System.out.print("Price : ");
                int p = ip.nextInt();

                System.out.print("Quantity : ");
                int q = ip.nextInt();

                System.out.print("Grams of Protein : ");
                int gpt = ip.nextInt();

                System.out.print("Grams of Carb : ");
                int gc = ip.nextInt();

                System.out.print("Grams of Fat : ");
                int gf = ip.nextInt();
                pizzaOrder.add(new Pizza(s, bl, p, q, gpt, gc, gf));
            } else if (menu == 2) {

                System.out.print("Size : [1] Small  [2] Medium  [3] Large  [4] Extra Large -> ");

                try {
                    size = ip.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                System.out.print("Quantity : ");
                int q = ip.nextInt();

                frenchOrder.add(new Frenchfries( q, size));
            }
        }
        // Pizza[] pizza = new Pizza[numOfPizza];

        System.out.println();

        int totalCalories = 0, totalPrice = 0;
        for (int i = 0; i < pizzaOrder.size(); i++) {
            System.out.println("Pizza " + (i + 1));
            System.out.println(pizzaOrder.get(i));
            totalPrice += pizzaOrder.get(i).getTotalPrice();
            totalCalories += pizzaOrder.get(i).caloriesCalculator();
        }

        String[] size_string = {"Small","Medium","Large","Extra Large"};
        int[] amount_frenchfries = {0,0,0,0};

        for (int i = 0; i < frenchOrder.size(); i++) {
            totalPrice +=frenchOrder.get(i).getTotalPrice();
            totalCalories += frenchOrder.get(i).caloriesCalculator();
        }

        int j=0;

        for (int i = 0; i < frenchOrder.size(); i++) {
            while(frenchOrder.get(i).getSize()!=size_string[j]){
                j++;
            }
            amount_frenchfries[j] += frenchOrder.get(i).getQuantity();
            j=0;
        }
        
        if(frenchOrder.size()!=0){
            System.out.println("French fries");
        }
    
        for(int i=0;i<4;i++){
            if(amount_frenchfries[i]!=0){
                System.out.println(size_string[i] +" : " + amount_frenchfries[i]);
            }
        }

        System.out.println();

        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Calories : " + totalCalories);
        System.out.println();
        System.out.println("----Thank You----");

        ip.close();
        ipStr.close();
    }
}
