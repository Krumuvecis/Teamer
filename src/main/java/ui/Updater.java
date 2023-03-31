package ui;

import org.jetbrains.annotations.NotNull;

//
public final class Updater extends Thread implements Runnable {
    private static final long DELAY = 20;
    private final @NotNull Window window;

    //
    public Updater(@NotNull Window window) {
        this.window = window;
    }

    //
    @SuppressWarnings({"InfiniteLoopStatement", "BusyWait"})
    @Override
    public void run() {
        while (true) {
            window.repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException ignored) {}
        }
    }
}