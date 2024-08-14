import java.awt.Color;
import java.awt.Polygon;

public class Cat extends Actor {
  public Cat(Cell inLoc) {
    loc = inLoc;

    Polygon ear1 = new Polygon();
    ear1.addPoint(loc.x + 11, loc.y + 5);
    ear1.addPoint(loc.x + 15, loc.y + 15);
    ear1.addPoint(loc.x + 7, loc.y + 15);
    Polygon ear2 = new Polygon();
    ear2.addPoint(loc.x + 22, loc.y + 5);
    ear2.addPoint(loc.x + 26, loc.y + 15);
    ear2.addPoint(loc.x + 18, loc.y + 15);
    Polygon face = new Polygon();
    face.addPoint(loc.x + 5, loc.y + 15);
    face.addPoint(loc.x + 29, loc.y + 15);
    face.addPoint(loc.x + 17, loc.y + 30);
    
    Polygon whiskers1 = new Polygon();
    whiskers1.addPoint(loc.x + 17, loc.y + 22);
    whiskers1.addPoint(loc.x + 2, loc.y + 20);
    Polygon whiskers2 = new Polygon();
    whiskers2.addPoint(loc.x + 17, loc.y + 25);
    whiskers2.addPoint(loc.x + 2, loc.y + 25);
    Polygon whiskers3 = new Polygon();
    whiskers3.addPoint(loc.x + 17, loc.y + 27);
    whiskers3.addPoint(loc.x + 2, loc.y + 30);

    Polygon whiskers4 = new Polygon();
    whiskers1.addPoint(loc.x + 17, loc.y + 22);
    whiskers1.addPoint(loc.x + 32, loc.y + 20);
    Polygon whiskers5 = new Polygon();
    whiskers2.addPoint(loc.x + 17, loc.y + 25);
    whiskers2.addPoint(loc.x + 32, loc.y + 25);
    Polygon whiskers6 = new Polygon();
    whiskers3.addPoint(loc.x + 17, loc.y + 27);
    whiskers3.addPoint(loc.x + 32, loc.y + 30);

  
    polygons.add(face);
    polygons.add(ear1);
    polygons.add(ear2);
    polygons.add(whiskers1);
    polygons.add(whiskers2);
    polygons.add(whiskers3);
  }
}
