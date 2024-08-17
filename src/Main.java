import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();

      ArrayList<Point> mouseTrail = new ArrayList<>();
      final int TRAIL_SIZE = 100;

      public Canvas() {
        setPreferredSize(new Dimension(720, 720));

        addMouseMotionListener(new MouseMotionAdapter() {
          @Override
          public void mouseMoved(java.awt.event.MouseEvent e) {
              addMousePosition(e.getPoint());
          }
      });
      }

      public void addMousePosition(Point p) {
        if (mouseTrail.size() >= TRAIL_SIZE) {
            mouseTrail.remove(0); // Remove the oldest position
        }
        mouseTrail.add(p); // Add the newest position
    }

      @Override
      public void paint(Graphics g) {
        grid.paint(g, getMousePosition());

        int alphaStep = 255 / TRAIL_SIZE;
        for (int i = 0; i < mouseTrail.size(); i++) {
          Point p = mouseTrail.get(i);
          if (p != null) {
            int alpha = (i + 1) * alphaStep;
            g.setColor(new java.awt.Color(0, 0, 0, Math.min(alpha, 255))); // semi-transparent black
            g.fillOval(p.x - 5, p.y - 5, 10, 10); // Draw circle at the mouse position
         }
        }
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
