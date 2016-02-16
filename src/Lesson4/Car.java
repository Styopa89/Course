package Lesson4;


public class Car {
    private String name;
    private String number;

    private int doorCount;
    private  Color color;

    private int maxSpeed;

    private boolean isMoving;
    private boolean isLights;

    private  Car(){
        name = "WV";
        number = "AA 1589 CB";
        doorCount = 4;
        color = Color.BLUE;
        maxSpeed = 240;
        isMoving = false;
        isLights = false;
    }

    public void startMoving() {
        isMoving = true;
        System.out.println("isMoving  " + isMoving);
    }

    public void stopMoving() {
        isMoving =  false;
        System.out.println("isMoving  " + isMoving);
    }

    public void onLights() {
        isLights = true;
        System.out.println("isLights   " + isLights);
    }

    public void offLights() {
        isLights = false;
        System.out.println("isLights   " + isLights);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLights() {
        return isLights;
    }

    public void setIsLights(boolean isLights) {
        this.isLights = isLights;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }
}
