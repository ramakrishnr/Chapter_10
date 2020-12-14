
public class TeeShirt {
    //fields
    enum Color {BLACK, BLUE, WHITE};
    enum Size {S, M, L, XL, XXL, XXXL};
    private int orderNUmber;
    private Size size;
    private Color color;
    private double price;
    //constructor
    
    //mutator
    public void setOrderNUmber(int orderNUmber) {
        this.orderNUmber = orderNUmber;
    }
    public void setSize(Size size) {
        boolean bigSize = size.equals(Size.XXL) || size.equals(Size.XXXL);
        this.size = size;
        this.price = (bigSize)? 22.99 : 19.99;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    //accessor
    public int getOrderNUmber() {
        return orderNUmber;
    }
    public Size getSize() {
        return size;
    }public Color getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    //methods

}
