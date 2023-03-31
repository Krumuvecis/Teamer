package ui;

import javax.swing.JFrame;
import org.jetbrains.annotations.NotNull;

public class Window extends JFrame {
    private static final int @NotNull []
            LOCATION = new int[] {50, 50},
            SIZE = new int[] {200, 200},
            SIZE_ERROR_CORRECTION = new int[] {16, 39};

    public Window() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(SIZE[0] + SIZE_ERROR_CORRECTION[0], SIZE[1] + SIZE_ERROR_CORRECTION[1]);
        setLocation(LOCATION[0], LOCATION[1]);
        setVisible(true);
        add(new WindowPanel());
    }
}