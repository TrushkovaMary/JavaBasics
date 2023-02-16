package SwingMove.DVDrandomDirect;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class MyPanel extends JPanel {
    private static final int width = 700, height = 400;
    private boolean up = false;
    private boolean right = true;
    private boolean down = true;
    private boolean left = false;
    private boolean tempBool = true;
    private BufferedImage image;
    private int upMax = 0;
    private int rightMax = width;
    private int downMax = height-10;
    private int leftMax = 0;
    private int speedX = 5;
    private int speedY = 4;
    int x0 = 100, y0 = 100;
    MyPanel(){
        this.setPreferredSize(new Dimension(600,600));
        loadImage();
        start();
//        new Thread(this).start();
    }

    public void loadImage(){
        try {
            image = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\DVDrandomDirect\\DVD.png"));
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
            x0 += speedX+speedX*Math.random();
        } else {
            x0 -= (speedX+speedX*Math.random());
        }
        if (down) {
            y0 += speedY+speedY*Math.random();
        } else{
            y0 -= (speedY+speedY*Math.random());
        }

        if (right && x0>rightMax){
            right = false;
            left = true;
        } else if (down && y0>downMax) {
            down = false;
            up = true;
        } else if (left && x0<leftMax) {
            left = false;
            right = true;
        } else if (up && y0<upMax) {
            up = false;
            down = true;
        }
        repaint();
    }


}
