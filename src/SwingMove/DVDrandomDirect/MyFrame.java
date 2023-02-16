package SwingMove.DVDrandomDirect;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        MyPanel panel = new MyPanel();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dm.width/2-300, dm.height/2-150, 700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Straight");
        panel.setBackground(Color.CYAN);
        this.add(panel);
        this.setVisible(true);
    }
}
