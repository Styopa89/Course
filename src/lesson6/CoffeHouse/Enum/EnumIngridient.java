package lesson6.CoffeHouse.Enum;


import lesson6.CoffeHouse.Ingridients.*;

public enum EnumIngridient {

    COFFE(new Coffe()), MILK(new Milk()), BLACK_TEA(new BlackTea()), GREEN_TEA(new GreenTea()),
    BERGAMONT(new Bergamont()), WATER(new Water()), SUGAR(new Sugar());

    private AbstractIngridient ingridient;

    public AbstractIngridient getIngridient() {
        return ingridient;
    }

    EnumIngridient(AbstractIngridient ingridient) {
        this.ingridient = ingridient;
    }

}
