package BasicJava.day11.wePrb;

public class IsThereConflict {

}

interface Shape{
    String s = "Shape";
    void draw();
}

interface Rectangle{
    String s = "Rectangle";
    void draw();
}

class Square implements Shape,Rectangle{
    @Override
    public void draw() {
        System.out.println("Method of shape interface");
    }
    void gets(){
        System.out.println(Shape.s);
        System.out.println(Rectangle.s);
    }
}