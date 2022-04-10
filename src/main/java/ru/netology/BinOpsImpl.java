package ru.netology;

public class BinOpsImpl implements BinOps {

    @Override
    public String sum(String a, String b) {
        return BinOpsConverter.convertToString(BinOpsConverter.convertToInt(a) + BinOpsConverter.convertToInt(b));
    }

    @Override
    public String mult(String a, String b) {
        return BinOpsConverter.convertToString(BinOpsConverter.convertToInt(a) * BinOpsConverter.convertToInt(b));
    }
}
