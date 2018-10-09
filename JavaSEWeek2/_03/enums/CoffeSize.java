package _03.enums;

public enum CoffeSize {
SHORT(5),TALL(6),GRANDE(8),VENTI(12);
 private int price;

    CoffeSize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
