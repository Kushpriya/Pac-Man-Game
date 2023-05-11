package Pacman;
import javax.swing.*;
public class Pacman extends JFrame {
    public Pacman() {
        add(new Model());
    }
    public static void main(String[] args) {
        Pacman pacman = new Pacman();
        pacman.setVisible(true);
        pacman.setTitle("Pacman");
        pacman.setResizable(false);
        pacman.setSize(380, 420);
        pacman.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pacman.setLocationRelativeTo(null);
    }
}