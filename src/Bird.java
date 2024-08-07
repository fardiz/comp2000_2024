import java.awt.*;

public class Bird extends Actor{

    public Bird(int inX, int inY) {
        super(inX, inY);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
    }
}
