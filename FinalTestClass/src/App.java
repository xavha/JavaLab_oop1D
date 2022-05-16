import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Pizza Restaurant");
        System.out.println("----Let's Order Pizza----");
        System.out.println("How many Pizza Do you want to Order : ");

        Scanner ip = new Scanner(System.in);
        Scanner ipStr = new Scanner(System.in);
        int numOfPizza = ip.nextInt();

        Pizza[] pizza = new Pizza[numOfPizza];

        for(int i=0;i<numOfPizza;i++){
            System.out.println("Pizza "+(i+1));

            System.out.println("Name of menu : ");
            String s = ipStr.nextLine();

            System.out.println("Is Vegetarian (true or false) : ");
            boolean bl = ip.nextBoolean();

            System.out.println("Price : ");
            int p = ip.nextInt();

            System.out.println("Quantity : ");
            int q = ip.nextInt();

            System.out.println("Grams of Protein : ");
            int gpt = ip.nextInt();

            System.out.println("Grams of Carb : ");
            int gc = ip.nextInt();

            System.out.println("Grams of Fat : ");
            int gf = ip.nextInt();

            pizza[i] = new Pizza(s,bl,p,q,gpt,gc,gf);
        }

        System.out.println();

        int totalCalories=0,totalPrice=0;
        for(int i=0;i<numOfPizza;i++){
            System.out.println("Pizza "+ (i+1));
            System.out.println(pizza[i]);
            totalPrice += pizza[i].getTotalPrice();
            totalCalories += pizza[i].caloriesCalculator();
        }

        System.out.println("Total Price : " + totalPrice);
        System.out.println("Total Calories : " + totalCalories);

        ip.close();
        ipStr.close();
    }
}
