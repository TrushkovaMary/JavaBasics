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
    private int deltaX = 0;
    private int deltaY = 0;
    private int radius;
    MyPanel(){
        this.setPreferredSize(new Dimension(600, 600));
        loadImage();
        setSun();
        setFirstEarth();
        start();
    }
    private void setSun(){
        xSun = panelWidth/2 - imageWidthSun/2;
        ySun = panelHeight/2 - imageHeightSun/2;
    }
    private void setFirstEarth(){
        radius = Math.max(panelHeight,panelWidth)/2 - Math.max(imageHeightSun, imageWidthSun);
        deltaX = panelWidth/2-imageWidthEarth/2;
        deltaY = panelHeight/2-imageHeightEarth/2;
    }
    private void setEarth(){
        xEarth = deltaX + (int) (radius*Math.cos(angle));
        yEarth = deltaY + (int) (radius*Math.sin(angle));
    }
    public void loadImage(){
        try {
            imageEarth = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\EarthRotate\\Earth_cartoon.png"));
            imageWidthEarth = imageEarth.getWidth();
            imageHeightEarth = imageEarth.getHeight();

            imageSun = ImageIO.read(new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\SwingMove\\EarthRotate\\sun2.png"));
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
