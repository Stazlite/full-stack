
    import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

    public class ghhjdb {
        public static void main(String[] args) {
            try {
                File file = new File("file.jpg"); // Make sure the file exists
                BufferedImage image = ImageIO.read(file);
                if (image != null) {
                    System.out.println("Image loaded successfully!");
                } else {
                    System.out.println("Failed to load image.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

