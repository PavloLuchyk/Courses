package com.example;

public final class OracleImmutableClass {
    private final int x;
    private final int y;

    public OracleImmutableClass(int x, int y) {
        this.x= x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
