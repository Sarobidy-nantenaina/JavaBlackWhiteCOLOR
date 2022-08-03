package Com.Black_White_image;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/actu2.jpg");
        BlackAndWhiteConverter.convertToBlackAndWhite(file, "blackwhitePic");

    }

}
