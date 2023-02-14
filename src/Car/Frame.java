package Car;

import javax.swing.JFrame;

public class Frame extends JFrame {

    public Frame() {
        Panel panel = new Panel();
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Car");
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
