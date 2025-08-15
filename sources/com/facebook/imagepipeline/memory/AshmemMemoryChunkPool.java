package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;

@TargetApi(27)
@pm4
public class AshmemMemoryChunkPool extends pq8 {
    @pm4
    public AshmemMemoryChunkPool(sq8 sq8, n5b n5b, o5b o5b) {
        super(sq8, n5b, o5b);
    }

    public final Object a(int i) {
        return new et(i);
    }
}
