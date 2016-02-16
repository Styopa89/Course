package Lesson6.Frame23;


public class NPE extends Glyph {
    private String name = "Victor";
    public NPE() {
    }

    @Override
    public void draw() {
        name.length();
    }
}
