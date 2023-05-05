package pacman;

import javax.swing.JFrame;

public class Pacman extends JFrame{

    public Pacman() {
        add(new PacManGame());
    }


    public static void main(String[] args) {
        Pacman pac = new Pacman();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(400,450);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);

    }

}
