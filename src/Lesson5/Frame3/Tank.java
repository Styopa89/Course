package Lesson5.Frame3;

public class Tank {
    private String name;
    private String color;
    private int crew;
    private int maxSpeed;

    public Tank() {
        this("red", 4, 120);
    }

    public Tank(String color) {
        this(color, 0, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 200) {
            this.maxSpeed = 200;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public Tank(String color, int crew, int maxSpeed) {
        this.color = color;
        this.crew = crew;
        setMaxSpeed(maxSpeed);


    }

    public void printInfo() {
        System.out.println(this.getName());
        System.out.println(this.getColor());
        System.out.println(this.getCrew());
        System.out.println(this.getMaxSpeed());
        System.out.println();
    }
    public void move() {
        System.out.println("tank move");
        printInfo();
    }
}
