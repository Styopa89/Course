package lesson6.CoffeHouse.Enum;


import lesson6.CoffeHouse.Products.*;

public enum EnumProduct {

    AMARICANO(new Americano()), BLACK_COFFE(new BlackCoffe()),CAPUCHINO(new Capuchino()), COFFE_WITH_MILK(new CoffeWithMilk()),
    MOCACHINO(new Mocachino()), BLACK_TEA(new BlackTea()), GREEN_TEA(new GreenTea()), TEA_WITH_BERGAMONT(new TeaWithBergamont());


    private AbstractProduct product;

    public AbstractProduct getProduct() {
        return product;
    }

    EnumProduct(AbstractProduct product) {
        this.product = product;
    }

}
