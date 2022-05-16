public class Pizza extends Food implements CaloriesCalculator {
    private int gramsOfProtein,gramsOfCarb,gramsOfFat;

    Pizza(){

    }

    Pizza(int gramsOfProtein, int gramsOfCarb, int gramsOfFat) {
        this.gramsOfProtein = gramsOfProtein;
        this.gramsOfCarb = gramsOfCarb;
        this.gramsOfFat = gramsOfFat;
    }

    Pizza(String name,boolean isVegetarian,int price,int quantity,int gramsOfProtein, int gramsOfCarb, int gramsOfFat){
        super(name, isVegetarian, price, quantity);
        this.gramsOfProtein = gramsOfProtein;
        this.gramsOfCarb = gramsOfCarb;
        this.gramsOfFat = gramsOfFat;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Price : " + getTotalPrice() + "\n" +
                "Calories : " + caloriesCalculator() + "\n";
    }

    @Override
    public int caloriesCalculator(){
        return (((this.gramsOfProtein+this.gramsOfCarb)*4 )+ (this.gramsOfFat*9))*super.getQuantity();
    }

    @Override
    public int getTotalPrice(){
        return super.getPrice()*super.getQuantity();
    }

}
