package com.facebook.imagepipeline.memory;

@pm4
public class NativeMemoryChunkPool extends pq8 {
    @pm4
    public NativeMemoryChunkPool(sq8 sq8, n5b n5b, o5b o5b) {
        super(sq8, n5b, o5b);
    }

    public final Object a(int i) {
        return new NativeMemoryChunk(i);
    }
}
