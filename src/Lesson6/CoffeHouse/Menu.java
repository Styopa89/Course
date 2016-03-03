package Lesson6.CoffeHouse;


import Lesson6.CoffeHouse.Products.*;

public class Menu {
    private AbstractProduct[] menu = new AbstractProduct[8];
    public Menu() {
        menu[0] = new Americano();
        menu[1] = new BlackCoffe();
        menu[2] = new Mocachino();
        menu[3] = new Capuchino();
        menu[4] = new CoffeWithMilk();
        menu[5] = new GreenTea();
        menu[6] = new BlackTea();
        menu[7] = new TeaWithBergamont();
    }

    public void printMenu(){
        for (int i = 0; (i < menu.length && menu[i] != null); i++){
            System.out.println(menu[i].getName() + "; Ingrigients: " + menu[i].namesIngridient() + "; Price: " + menu[i].priceProduct());
        }
    }


}
