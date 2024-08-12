import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

<<<<<<< HEAD
public class Cell extends Rectangle{
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY, size, size);
=======
public class Cell extends Rectangle {
  static int size = 35;

  public Cell(int x, int y) {
    super(x, y, size, size);
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
  }

  public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

  @Override
  public boolean contains(Point p) {
    if(p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
}
