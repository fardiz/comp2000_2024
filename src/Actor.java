import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public abstract class Actor {
  ArrayList<Polygon> polygons = new ArrayList<Polygon>();
  Cell loc;

  public void paint(Graphics g) {
    for(int i = 0; i < polygons.size(); i++){
      g.drawPolygon(polygons.get(i));
    }
  }
}
