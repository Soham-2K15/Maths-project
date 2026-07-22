import javax.swing.*;
import java.awt.*;

public class DisplayImage {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Education Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 500);

        // Load the image
ImageIcon image = new ImageIcon("C:\Users\Dell\Desktop\SOHAM\education.png");

        // Create a label to hold the image
        JLabel label = new JLabel(image);

        // Add the label to the frame
        frame.add(label, BorderLayout.CENTER);

        // Display the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
