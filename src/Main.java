import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();

      Point[] mouseTrail = new Point[100];
        int trailIndex = 0;
        int trailCount = 0;

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
                mouseTrail.removeFirst(); // Remove the oldest position
            }
            mouseTrail.addLast(p); // Add the newest position
        }

      @Override
      public void paint(Graphics g) {
        grid.paint(g, getMousePosition());

        if (getMousePosition() != null) {
          mouseTrail[trailIndex] = getMousePosition();
          trailIndex = (trailIndex + 1) % mouseTrail.length; // Move to the next index
          if (trailCount < mouseTrail.length) {
              trailCount++;
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
        while (true) {
            repaint();
            try {
                Thread.sleep(16); // Add a short delay to control frame rate (60fps)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
