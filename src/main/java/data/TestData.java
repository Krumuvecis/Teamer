package data;

import org.jetbrains.annotations.NotNull;

//
public class TestData {
    private int value = 0;

    //
    public TestData() {
        new Updater(this).start();
    }

    //
    public int getValue() {
        return value;
    }

    private void increaseValue() {
        value++;
    }

    //
    private static final class Updater extends Thread implements Runnable {
        private static final long DELAY = 20;
        private final @NotNull TestData data;

        //
        Updater(@NotNull TestData data) {
            this.data = data;
        }

        //
        @SuppressWarnings({"InfiniteLoopStatement", "BusyWait"})
        @Override
        public void run() {
            while (true) {
                data.increaseValue();
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}