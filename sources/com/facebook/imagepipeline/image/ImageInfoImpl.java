package com.facebook.imagepipeline.image;

import java.util.Map;

public class ImageInfoImpl implements ru6 {
    private final Map<String, Object> extras;
    private final int height;
    private final pqb qualityInfo;
    private final int sizeInBytes;
    private final int width;

    public ImageInfoImpl(int i, int i2, int i3, pqb pqb, Map<String, Object> map) {
        this.width = i;
        this.height = i2;
        this.sizeInBytes = i3;
        this.qualityInfo = pqb;
        this.extras = map;
    }

    public Map<String, Object> getExtras() {
        return this.extras;
    }

    public int getHeight() {
        return this.height;
    }

    public pqb getQualityInfo() {
        return this.qualityInfo;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    public int getWidth() {
        return this.width;
    }
}
