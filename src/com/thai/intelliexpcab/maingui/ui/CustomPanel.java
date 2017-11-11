package com.thai.intelliexpcab.maingui.ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class CustomPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        try {
            Image image = ImageIO.read(new File(getClass().getResource("/com/thai/intelliexpcab/resources/trans_demo.png").toURI()));
            g.drawImage(image, 0, 0, 768, 1024, null);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
