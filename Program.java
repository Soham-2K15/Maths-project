import javax.swing.*;
import java.awt.*;

public class DisplayImage {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Education Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);

        ImageIcon image = new ImageIcon("C:\Users\Dell\Desktop\SOHAM\education.png");
        JLabel label = new JLabel(image);

        frame.add(label, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
