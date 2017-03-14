package lesson5.Frame3;

public class Tiger extends Tank {
    private int armor;
    public Tiger() {
        setName("Tiger");
        setMaxSpeed(36);
        setColor("green");
        setCrew(6);
        armor = 1;
    }
    @Override
    public void printInfo(){

        System.out.println("Name: " + this.getName() + ", Color:" + this.getColor() + ", Crew:" + this.getCrew()  + ", MaxSpeed:" + this.getMaxSpeed() + ", Armor: " + armor);
    }
}
