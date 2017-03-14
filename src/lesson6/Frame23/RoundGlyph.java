package lesson6.Frame23;

public class RoundGlyph extends Glyph {

    private int radius = 5;

    public RoundGlyph(int radius) {
        System.out.println("RoundGlyph#constructor");
        draw();
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("RoundGlyph#draw");
        System.out.println("RounfGlyph [radius: " + radius + "]");
    }
}
