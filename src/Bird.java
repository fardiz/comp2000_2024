<<<<<<< HEAD
import java.awt.*;

public class Bird extends Actor{

    public Bird(int inX, int inY) {
        super(inX, inY);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
    }
=======
import java.awt.Color;

public class Bird extends Actor {
  public Bird(Cell inLoc) {
    loc = inLoc;
    color = Color.GREEN;
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
