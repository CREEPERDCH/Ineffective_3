package com.thai.intelliexpcab.maingui.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class CustomPanel1 extends JPanel {
    Image image = null;

    @Override
    public void paint(Graphics g) {
        try {
            image = ImageIO.read(new File(getClass().getResource("/com/thai/intelliexpcab/resources/custom_new.png").toURI()));
            g.drawImage(image, 0, 0, 768, 370, null);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
