public class TeeShirt {
    //fields
    private String orderNumber;
    private String size;
    private String color;
    private double price;
    private final String XXL = "XXL";
    private final String XXXL = "XXXL";
    private final double PRICE_XXL_XXXL = 22.99;
    private final double PRICE_OTHERS = 19.99;

    //mutator
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public void setSize(String size) {
        this.size = size;
        if(size.equals(XXL) || size.equals(XXXL)) {
            this.price = PRICE_XXL_XXXL;
        }
        else {
            this.price = PRICE_OTHERS;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }

    //accessors
    public String getOrderNumber() {
        return orderNumber;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
}
