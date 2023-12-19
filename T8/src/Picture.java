import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Picture extends JFrame{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageDisplay <image_path>");
            System.exit(1);
        }

        showImage(args[0]);
    }

    public static void showImage(String imagePath) {
        JFrame frame = new JFrame("Image Display");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading image", "Error", JOptionPane.ERROR_MESSAGE);
        }

        frame.setVisible(true);
    }
}
