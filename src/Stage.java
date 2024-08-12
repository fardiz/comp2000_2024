<<<<<<< HEAD
public class Stage {
    Grid grid = new Grid();

    public Stage(){
        
    }
=======
import java.awt.Graphics;
import java.awt.Point;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    cat.paint(g);
    dog.paint(g);
    bird.paint(g);
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
