package Lesson4.Frame4;

public class Tank {
	private String color;
	private int crew;
	private int maxSpeed;
	
	public Tank() {
		this("red", 4, 120);
		System.out.println("Tank");
	}
	
	public Tank (String color) {
		this(color, 0, 0);
		System.out.println("Tank(String color)");
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

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
		this.maxSpeed = maxSpeed;
		}
	}

	public Tank (String color, int crew, int maxSpeed) {
		this.color = color;
		this.crew = crew;
		setMaxSpeed(maxSpeed);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Tank tank = (Tank) o;

		if (crew != tank.crew) return false;
		if (maxSpeed != tank.maxSpeed) return false;
		return color.equals(tank.color);

	}

	@Override
	public int hashCode() {
		int result = color.hashCode();
		result = 31 * result + crew;
		result = 31 * result + maxSpeed;
		return result;
	}
}

