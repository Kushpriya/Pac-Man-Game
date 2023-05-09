import pacman.Pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HomeScreen extends JPanel implements ActionListener {

    public void paint(Graphics g) {
        // set background color
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        // draw title text
        g.setColor(Color.yellow);
        g.setFont(new Font("Arial", Font.BOLD, 66));
        g.drawString("PAC-MAN", getWidth() / 2 - 150, 200);

        // draw Pac-Man image
        g.setColor(Color.yellow);
        g.fillArc(getWidth() / 2 - 50, 250, 100, 100, 30, 300);

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac-Man");
        frame.setSize(800, 800);

        JButton button = new JButton("START");
        button.setBounds(300,600,200,100);
        button.setFont(new Font("Arial",Font.BOLD,40));
        button.setBackground(Color.getHSBColor(10,100,200));
        frame.add(button);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new HomeScreen());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pacman game = new Pacman();
    }

}
