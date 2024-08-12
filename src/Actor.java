<<<<<<< HEAD
import java.awt.*;

public class Actor {
    

    public Actor(int inX, int inY){
        Cell location = new Cell(inX, inY);
    }

   
=======
import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {
  Color color;
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
