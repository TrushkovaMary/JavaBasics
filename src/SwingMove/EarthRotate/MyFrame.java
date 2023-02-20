package SwingMove.EarthRotate;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        MyPanel panel = new MyPanel();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dm.width/2 - 300, dm.height/2-300, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.BLACK);
        this.add(panel);
        this.setVisible(true);
    }
}
