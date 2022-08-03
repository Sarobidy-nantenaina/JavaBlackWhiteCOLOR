package Com.Black_White_image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BlackAndWhiteConverter {

    public static void convertToBlackAndWhite(File file, String newFileName) {
        try {

            final BufferedImage colorImage = ImageIO.read(file);

            Graphics2D g = colorImage.createGraphics();
            g.drawImage(colorImage, null, 0, 0);

            final BufferedImage grayImage = new BufferedImage(colorImage.getWidth(), colorImage.getHeight(),
                    BufferedImage.TYPE_BYTE_GRAY);
            g = grayImage.createGraphics();
            g.drawImage(colorImage, 0, 0, null);
            g.dispose();

            File output = new File("C:/Users/" + newFileName + ".png");
            ImageIO.write(grayImage, "png", output);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
