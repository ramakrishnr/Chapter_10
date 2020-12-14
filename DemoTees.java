
public class DemoTees {
    public static void main(String[] args) {
        TeeShirt aShirt = new TeeShirt();
        CustomTee aCustomTee = new CustomTee();

        aShirt.setOrderNumber(1111);
        aShirt.setShirtColor(ShirtColor.BLACK);
        aShirt.setSize(Size.M);

        aCustomTee.setOrderNumber(2222);
        aCustomTee.setShirtColor(ShirtColor.WHITE);
        aCustomTee.setSize(Size.XXXL);
        aCustomTee.setSlogan("Happy Bunny");

        aShirt.display();
        aCustomTee.display();
    }
}
