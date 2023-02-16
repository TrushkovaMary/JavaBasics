package SwingMove.StraightDirect;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        MyPanel panel = new MyPanel();
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(dm.width/2-300, dm.height/2-300, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Straight");
        this.add(panel);
        this.setVisible(true);
    }
}
