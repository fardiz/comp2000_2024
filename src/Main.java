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
