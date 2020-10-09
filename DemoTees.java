public class DemoTees {
    public static void main(String[] args) {
        TeeShirt aTeeShirt = new TeeShirt();
        TeeShirt bTeeShirt = new TeeShirt();
        CustomTee aCustomTee = new CustomTee();
        CustomTee bCustomTee = new CustomTee();

        aTeeShirt.setOrderNumber("A1010");
        aTeeShirt.setColor("White");
        aTeeShirt.setSize("M");
    
        bTeeShirt.setOrderNumber("A2020");
        bTeeShirt.setColor("White");
        bTeeShirt.setSize("XXL");

        aCustomTee.setOrderNumber("B1010");
        aCustomTee.setColor("Green");
        aCustomTee.setSize("M");
        aCustomTee.setSlogan("Just Bang It");
        
        bCustomTee.setOrderNumber("B2020");
        bCustomTee.setColor("Green");
        bCustomTee.setSize("XXL");
        bCustomTee.setSlogan("Just Dang It");
        
        System.out.println(aTeeShirt.getOrderNumber());
        System.out.println(aTeeShirt.getColor());
        System.out.println(aTeeShirt.getSize());
        System.out.println(aTeeShirt.getPrice());

        System.out.println();
        System.out.println(bTeeShirt.getOrderNumber());
        System.out.println(bTeeShirt.getColor());
        System.out.println(bTeeShirt.getSize());
        System.out.println(bTeeShirt.getPrice());
        
        System.out.println();
        System.out.println(aCustomTee.getOrderNumber());
        System.out.println(aCustomTee.getColor());
        System.out.println(aCustomTee.getSize());
        System.out.println(aCustomTee.getPrice());
        System.out.println(aCustomTee.getSlogan());
        
        System.out.println();
        System.out.println(bCustomTee.getOrderNumber());
        System.out.println(bCustomTee.getColor());
        System.out.println(bCustomTee.getSize());
        System.out.println(bCustomTee.getPrice());
        System.out.println(bCustomTee.getSlogan());
        
    }
}
