package SwingMove.StraightDirect;

import Car.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Straight  {

    public static void main(String[] args) {
        new MyFrame();
    }


}

class StraightPanel extends JPanel{
    StraightPanel(){
        this.setPreferredSize(new Dimension(600,600));
    }

    @Override
    public void paint(Graphics g) {
//        Font font = new Font("Bitstream Charter", Font.BOLD, 20);
        Graphics2D g2D = (Graphics2D) g;
//        g2D.setColor(Color.blue);
//        g2D.setFont(font);
//        g2D.drawString("Hello, java!", 30, 30);
//        Point2D p1 = new Point2D.Double(70, 70);
//        Point2D p2 = new Point2D.Double(170, 170);
//        Line2D l2 = new Line2D.Double(p1, p2);
//        g2D.draw(l2);
//        Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);
//        g2D.draw(el);
//        Rectangle2D re = new Rectangle2D.Double(70, 70, 170, 170);
//        g2D.draw(re);
        final int[] coords = {0, 0};
        ActionListener messageAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coords[0] += 1;
                coords[1] += 1;
                repaint();
            }
        };
        Timer timer = new Timer(3, messageAL);
        timer.start();
        try {
            String s1 = "https://www.google.com/url?sa=i&url=http%3A%2F%2Fwww.stickpng.com%2Fimg%2Ficons-logos-emojis%2Ftech-companies%2Fjava-logo&psig=AOvVaw3IkHXSnluY5izp1du--ROT&ust=1676490832248000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIj2nZbllf0CFQAAAAAdAAAAABAE";
            String s2 = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngitem.com%2Fmiddle%2Foxioiw_transparent-rick-and-morty-png-rick-and-morty%2F&psig=AOvVaw36SD8DNZHndwDDMX4Mx8yo&ust=1676482557344000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCLjQqazGlf0CFQAAAAAdAAAAABAJ";
            URL url = new URL(s1);
            Image image = new ImageIcon("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\StraightDirect\\saucer.png").getImage();
            g2D.drawImage(image, coords[0], coords[1], null);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
}
