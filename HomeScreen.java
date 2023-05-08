import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeScreen extends JPanel {

    public void paint(Graphics g) {
        // set background color
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        // draw title text
        g.setColor(Color.yellow);
        g.setFont(new Font("Arial", Font.BOLD, 48));
        g.drawString("PAC-MAN", getWidth() / 2 - 120, 100);

        // draw Pac-Man image
        g.setColor(Color.yellow);
        g.fillArc(getWidth() / 2 - 50, 150, 100, 100, 30, 300);

        // draw "Press any key to start" text
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("Press any key to start", getWidth() / 2 - 130, 300);

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac-Man");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new HomeScreen());
        frame.setVisible(true);
    }
}
