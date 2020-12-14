
enum Size {S, M, L, XL, XXL, XXXL}
enum ShirtColor {WHITE, BLACK}

public class TeeShirt {
    //fields
    private int orderNumber;
    private Size size;
    private ShirtColor shirtColor;
    private double price;
    private final double S_to_L_PRICE = 19.99;
    private final double XXL_to_XXXL_PRICE = 22.99;

    //constructor

    //mutator
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    public void setSize(Size size) {
        this.size = size;
        if (size == Size.XXL || size == Size.XXXL) {
            this.price = XXL_to_XXXL_PRICE;
        }
        else {
            this.price = S_to_L_PRICE;
        }
    }
    public void setShirtColor(ShirtColor shirtColor) {
        this.shirtColor = shirtColor;
    }

    //accessor
    public int getOrderNumber() {
        return orderNumber;
    }
    public Size getSize() {
        return size;
    }
    public ShirtColor getShirtColor() {
        return shirtColor;
    }
    public double getPrice() {
        return price;
    }

    //method
	public void display() {
        System.out.println(getOrderNumber() + " " + getSize() + " " + getShirtColor() + " " + getPrice());
	}

}
