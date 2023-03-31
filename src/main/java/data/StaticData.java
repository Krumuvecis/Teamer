package data;

import org.jetbrains.annotations.NotNull;

public class StaticData {
    public static @NotNull TestData testData;

    static {
        testData = new TestData();
    }
}