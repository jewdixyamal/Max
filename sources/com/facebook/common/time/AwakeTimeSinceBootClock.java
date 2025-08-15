package com.facebook.common.time;

@pm4
public class AwakeTimeSinceBootClock implements ic9 {
    @pm4
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @pm4
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @pm4
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @pm4
    public long nowNanos() {
        return System.nanoTime();
    }
}
