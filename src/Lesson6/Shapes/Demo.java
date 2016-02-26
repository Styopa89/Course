package Lesson6.Shapes;

public class Demo {

    public static void main(String[] args) {
        Drawable[] shapes = new Drawable[] {
                new Square(),
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

       new ShapesTemplate(shapes);

    }

}
