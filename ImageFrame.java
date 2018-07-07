package package1;

import javax.swing.*;
import java.awt.*;

public class ImageFrame extends JComponent {
    private Image image;

    public ImageFrame(Image image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image,0,0,this);
    }
}