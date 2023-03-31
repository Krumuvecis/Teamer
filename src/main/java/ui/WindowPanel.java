package ui;

import java.awt.*;
import javax.swing.JPanel;

import data.StaticData;
import org.jetbrains.annotations.NotNull;

//the main panel of the window
class WindowPanel extends JPanel {
    private static final @NotNull Color BACKGROUND = new Color(0, 0, 0);

    //
    WindowPanel() {
        super();
        setBackground(BACKGROUND);
    }

    //
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString("x = " + StaticData.testData.getValue(), 50, 50);
    }
}