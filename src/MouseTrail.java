import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class MouseTrail {
    private static final int TRAIL_LENGTH = 100;
    private static final float ALPHA = 0.3f; // Transparency level
    private List<Point> trail = new ArrayList<>();

    public void addPoint(Point point) {
        trail.add(point);
        if (trail.size() > TRAIL_LENGTH) {
            trail.remove(0);
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < trail.size(); i++) {
            Point point = trail.get(i);
            float alpha = ALPHA * (1 - (float) i / TRAIL_LENGTH); // Gradually decrease alpha
            g.setColor(new Color(0, 0, 0, alpha)); // Black with transparency
            g.fillOval(point.x - 5, point.y - 5, 10, 10);
        }
    }
}