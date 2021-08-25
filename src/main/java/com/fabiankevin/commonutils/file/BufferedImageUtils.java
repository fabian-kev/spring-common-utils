package com.fabiankevin.commonutils.file;

import org.springframework.core.io.ClassPathResource;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BufferedImageUtils {

    public static void saveAtDefaultDir(BufferedImage image, String fileName){
        try {
            ImageIO.write(image, "PNG", new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage toBufferedImage(String resourcePathFileName){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new ClassPathResource(resourcePathFileName).getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}
