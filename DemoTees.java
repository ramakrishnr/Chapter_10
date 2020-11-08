
public class DemoTees extends CustomTee{
    public static void main(String[] args) {
        TeeShirt aShirt = new TeeShirt();
        CustomTee aCustomTee = new CustomTee();

        //populating shirts
        aShirt.setOrderNUmber(1111);
        aShirt.setColor(Color.WHITE);
        aShirt.setSize(Size.S);

        aCustomTee.setOrderNUmber(2222);
        aCustomTee.setColor(Color.BLACK);
        aCustomTee.setSize(Size.XXXL);
        aCustomTee.setSlogan("The best LOL.");

        System.out.println();
        //displayResult(aShirt);
        System.out.println();
        displayResult(aCustomTee);
        System.out.println();
    }

    private static void displayResult(CustomTee xShirt) {
        System.out.println(xShirt.getOrderNUmber());
        System.out.println(xShirt.getColor());
        System.out.println(xShirt.getSize());
        System.out.println(xShirt.getPrice());
        System.out.println(xShirt.getSlogan());
    }
}
