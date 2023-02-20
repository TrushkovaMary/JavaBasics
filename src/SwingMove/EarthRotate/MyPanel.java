package SwingMove.EarthRotate;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {
    private BufferedImage imageEarth;
    private int imageWidthEarth;
    private int imageHeightEarth;
    private BufferedImage imageSun;
    private int imageWidthSun;
    private int imageHeightSun;

    private int xSun;
    private int ySun;
    private int xEarth;
    private int yEarth;
    private int panelWidth = 600;
    private int panelHeight = 600;
    private double angle = 0;
    private int radius;
    MyPanel(){
        this.setPreferredSize(new Dimension(600, 600));
        loadImage();
        setSun();
        setEarth();
        start();
    }
    private void setSun(){
        xSun = panelWidth/2 - imageWidthSun/2;
        ySun = panelHeight/2 - imageHeightSun/2;
    }
    private void setEarth(){

        radius = panelHeight/2 - imageHeightSun/2;
        xEarth = xSun+imageWidthEarth/2+(int) (radius*Math.cos(angle));
        yEarth = ySun+imageHeightSun/2+(int) (radius*Math.sin(angle));
    }
    public void loadImage(){
        try {
            imageEarth = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\EarthRotate\\Earth_cartoon.png"));
            imageWidthEarth = imageEarth.getWidth();
            imageHeightEarth = imageEarth.getHeight();

            imageSun = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\EarthRotate\\Sun.png"));
            imageWidthSun = imageSun.getWidth();
            imageHeightSun = imageSun.getHeight();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.drawImage(imageSun, xSun, ySun, null);
        g2D.drawImage(imageEarth, xEarth, yEarth, null);

    }
    public void start(){
        Timer timer = new Timer(10, e -> nextStep());
        timer.start();
    }
    private void nextStep(){
        angle += 0.05;
        setEarth();
        repaint();
    }
}
