public abstract class Food {
    private String name;
    private int price;
    private int quantity;
    private boolean isVegetarian;

    protected Food(){

    }

    protected Food(int quantity){
        this.quantity = quantity;
    }

    protected Food(String name,boolean isVegetarian,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isVegetarian = isVegetarian;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIsVegetarian() {
        return this.isVegetarian;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  "Name : " + name + "\n" +
                "Is Vegetarian? : " + isVegetarian +"\n"  
                 ;
    }

    public abstract int getTotalPrice();

}
