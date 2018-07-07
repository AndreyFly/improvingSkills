package package1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
       File file = new File("C:\\Users\\myxa\\desktop","1.bmp");
       BufferedImage man1 = null;

       try {
           man1 = ImageIO.read(file);
       }
       catch (IOException e){
           e.printStackTrace();
       }
        JFrame jFrame = new JFrame();





        jFrame.setContentPane(new ImageFrame(man1));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

}

