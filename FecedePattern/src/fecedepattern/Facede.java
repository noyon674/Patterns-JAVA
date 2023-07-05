package fecedepattern;

public class Facede {
    private Circle circle;
    private Rectagule rect;
    private Square square;
 
    public Facede(){
        circle = new Circle();
        rect = new Rectagule();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangul(){
        rect.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
