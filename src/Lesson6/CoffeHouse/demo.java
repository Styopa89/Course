package Lesson6.CoffeHouse;


import Lesson6.CoffeHouse.Ingridients.AbstractIngridient;
import Lesson6.CoffeHouse.Ingridients.Coffe;
import Lesson6.CoffeHouse.Ingridients.Water;

public class demo {
    public static void main(String[] args) {
        AbstractIngridient aI = new Water();

        printInfoIngradient(aI);

    }
        public static void printInfoIngradient(AbstractIngridient aI) {
        System.out.println(aI.getNameIngradient());
        System.out.println(aI.getPrice());
        System.out.println(aI.getPortion());
        System.out.println();

    }
}
