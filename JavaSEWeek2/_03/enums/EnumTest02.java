package _03.enums;

public class EnumTest02 {
    public static void main(String[] args) {
        CoffeSize grande=CoffeSize.GRANDE;
        System.out.println(grande);
        System.out.println(grande.getPrice());
        System.out.println(grande.ordinal());


        CoffeSize grande2=CoffeSize.GRANDE;
        System.out.println(grande==grande2);
        System.out.println(grande.equals(grande2));

        for (CoffeSize e: CoffeSize.values()){
            System.out.println(e+ " : "+ e.getPrice());
        }
    }
}
