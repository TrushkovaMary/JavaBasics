package SwingMove.SquareDirect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MyPanel extends JPanel {
    private static final int width = 600, height = 600;
    private boolean up = false;
    private boolean right = true;
    private boolean down = false;
    private boolean left = false;
    private BufferedImage image;
    private int upMax = 100;
    private int rightMax = 500;
    private int downMax = 500;
    private int leftMax = 100;
    private int speed = 3;
    int x0 = 100, y0 = 100;
    MyPanel(){
        this.setPreferredSize(new Dimension(600,600));
        loadImage();
        start();
//        new Thread(this).start();
    }

    public void loadImage(){
        try {
            image = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\StraightDirect\\saucer.png"));
            int imageWidth = image.getWidth();
            int imageHeight = image.getHeight();
            rightMax -= imageWidth;
            downMax -= imageHeight;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.drawImage(image, x0, y0, null);

    }

    public void start() {
        Timer timer = new Timer(10, e -> nextStep());
        timer.start();
    }

    private void nextStep() {
        if (right) {
            x0 += speed;
        } else if (down) {
            y0 += speed;
        } else if (left){
            x0 -= speed;
        } else if (up) {
            y0 -= speed;
        }

        if (right && x0>rightMax){
            right = false;
            down = true;
        } else if (down && y0>downMax) {
            down = false;
            left = true;
        } else if (left && x0<leftMax) {
            left = false;
            up = true;
        } else if (up && y0<upMax) {
            up = false;
            right = true;
        }


        repaint();
    }


}
