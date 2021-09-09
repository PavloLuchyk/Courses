package com.example;

public final class VideoImmutableClass {
    private final int point1;
    private final int point2;

    private VideoImmutableClass(int point1, int point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public static VideoImmutableClass getInstance(int point1, int point2) {
        return new VideoImmutableClass(point1, point2);
    }


}
