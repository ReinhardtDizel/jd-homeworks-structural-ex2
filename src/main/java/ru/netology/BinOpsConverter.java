package ru.netology;

import java.util.Objects;

public class BinOpsConverter {

    public static Integer convertToInt(String from) {
        Objects.requireNonNull(from);
        return Integer.parseInt(from, 2);
    }

    public static String convertToString(Integer from) {
        Objects.requireNonNull(from);
        return Integer.toBinaryString(from);
    }
}
