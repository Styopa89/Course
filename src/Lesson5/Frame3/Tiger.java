package Lesson5.Frame3;

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
        System.out.println(this.getName());
        System.out.println(this.getColor());
        System.out.println(this.getCrew());
        System.out.println(this.getMaxSpeed());
        System.out.println(this.armor);
    }
}
