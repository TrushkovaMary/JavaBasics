package SwingMove.StraightDirect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;

public class MyPanel extends JPanel {
    private static final int width = 600, height = 600;
    private Image image;
    private int x0=-180;
    private int y0=-180;
    MyPanel(){
        this.setPreferredSize(new Dimension(600,600));
        loadImage();
        start();
//        new Thread(this).start();
    }

    public void loadImage(){
        try {
            image = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\StraightDirect\\saucer.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.drawImage(image, x0, y0, null);

    }

    public void start() {
        Timer timer = new Timer(10, e -> nextStep());
        timer.start();
    }

    private void nextStep() {
        if(x0 > width || y0 > height) {
            x0 = -180;
            y0 = -180;
        }
        x0 += 3;
        y0 += 3;
        repaint();
    }

//    @Override
//    protected void printComponent(Graphics g) {
//        super.printComponent(g);
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.drawRect(100, 100, 10, 10);
//        try {
//            BufferedImage image = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\StraightDirect\\saucer.png"));
//            int imageWidth = image.getWidth();
//            int imageHeight = image.getHeight();
//            g2D.drawImage(image, 200, 200, this);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }

//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.drawRect(10, 10, 10, 10);
//        try {
//            BufferedImage image = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\StraightDirect\\saucer.png"));
//            int imageWidth = image.getWidth();
//            int imageHeight = image.getHeight();
//
//            int y = 0, x = 0;
//            while (true){
//                if (x>600 || y>600){
//                    y = 0;
//                    x = 0;
//                }
//                g2D.drawImage(image, x, y, this);
//                TimeUnit.MILLISECONDS.sleep(30);
////                g2D.clearRect(x, y, imageWidth, imageHeight);
//                x+=2;
//                y+=2;
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }


}
