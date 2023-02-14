package Car;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Panel extends JPanel {

    Panel() {
        this.setPreferredSize(new Dimension(600,600));

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        //Background
        g2D.setColor(Color.LIGHT_GRAY);;
        g2D.fillRect(0, 0, 600,600);

        //Wheels
        g2D.setColor(Color.white);
        g2D.fillOval(125, 460, 80, 80);
        g2D.fillOval(395, 460, 80, 80);
        g2D.setColor(Color.black);
        g2D.setStroke(new BasicStroke(25));
        g2D.drawOval(125, 460, 80, 80);
        g2D.drawOval(395, 460, 80, 80);

        //Car
        g2D.setStroke(new BasicStroke(5));
        Path2D car = new Path2D.Double(new Arc2D.Double(370, 435, 130, 130, 0, 180, Arc2D.OPEN));
        car.append(new Line2D.Double(370, 500, 230, 500), true);
        car.append(new Arc2D.Double(100, 435, 130, 130, 0, 180, Arc2D.OPEN), true);
        car.append(new Line2D.Double(100, 500, 50, 500), true);
        car.curveTo(50, 500, 30, 475, 50, 460);
        car.curveTo(50, 460, 50, 415, 75, 370);
        car.curveTo(75, 370, 270, 200, 435, 370);
        car.curveTo(435, 370, 590, 360, 575, 475);
        car.curveTo(575, 475, 590, 490, 575, 500);
        car.closePath();
        g2D.setColor(Color.green);
        g2D.fill(car);
        g2D.setColor(Color.black);
        g2D.draw(car);

        //Left window
        Path2D window1 = new Path2D.Double(new Line2D.Double(250, 370, 140, 370));
        window1.curveTo(140, 370, 210, 325, 250, 330);
        window1.closePath();
        g2D.setColor(Color.blue);
        g2D.fill(window1);
        g2D.setColor(Color.black);
        g2D.draw(window1);

        //Right window
        Path2D window2 = new Path2D.Double(new Line2D.Double(270, 370, 270, 330));
        window2.curveTo(270, 330, 320, 325, 385, 370);
        window2.closePath();
        g2D.setColor(Color.blue);
        g2D.fill(window2);
        g2D.setColor(Color.black);
        g2D.draw(window2);

        //Some stuff
        g2D.drawLine(280, 395, 310, 395);
        Path2D light = new Path2D.Double(new Line2D.Double(510, 415, 510, 415));
        light.curveTo(510, 415, 550, 410, 545, 450);
        light.curveTo(545, 450, 505, 455, 510, 415);
        g2D.setColor(Color.yellow);
        g2D.fill(light);
        g2D.setColor(Color.black);
        g2D.draw(light);


    }
}
