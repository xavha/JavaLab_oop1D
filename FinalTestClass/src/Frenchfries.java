public class Frenchfries extends Food implements CaloriesCalculator {

    private String[] size_string = {"Small","Medium","Large","Extra Large"};
    private int size;

    public Frenchfries() {
    }

    public Frenchfries(int quantity,int size) {
        super(quantity);
        this.size = size;
    }

    public String getSize() { 
        return size_string[size-1];
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "Size : " + getSize() + "\n" +
                "Quantity : " + super.getQuantity() + "\n" +
                "Price : " + getTotalPrice() + "\n" +
                "Calories : " + caloriesCalculator() + "\n";
    }

    @Override
    public int caloriesCalculator() {
        switch (this.size) {
            case 1:
                return 280*super.getQuantity();
            case 2:
                return 360*super.getQuantity();
            case 3:
                return 420*super.getQuantity();
            default:
                return 550*super.getQuantity();
        }
    }

    @Override
    public int getTotalPrice(){
        switch (this.size) {
            case 1:
                return 30*super.getQuantity();
            case 2:
                return 45*super.getQuantity();
            case 3:
                return 60*super.getQuantity();
            default:
                return 85*super.getQuantity();
        }
    }

}
