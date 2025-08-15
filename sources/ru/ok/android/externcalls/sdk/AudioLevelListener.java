package ru.ok.android.externcalls.sdk;

import android.os.Handler;

public class AudioLevelListener implements z99 {
    private final Handler handler;
    private boolean isActive = true;
    private final w4g noise;
    private final Runnable reporter;
    private final short triggerDiff;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, w4g] */
    public AudioLevelListener(short s, Handler handler2, Runnable runnable) {
        ? obj = new Object();
        obj.a = Float.NaN;
        this.noise = obj;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler2;
        obj.a = !Float.isNaN(obj.a) ? 0.0f + (0.95f * obj.a) : 0.0f;
    }

    public void listen() {
        this.isActive = true;
    }

    public void onSample(int i, int i2, int i3, uoa uoa) {
        float f;
        if (this.isActive) {
            float f2 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f2 = 0.0f;
            }
            for (int i4 = 0; i4 < uoa.a; i4++) {
                float abs = (float) Math.abs(uoa.a(i4));
                if (Float.isNaN(f)) {
                    f = abs;
                } else {
                    f = (0.3f * abs) + (0.7f * f);
                }
                w4g w4g = this.noise;
                if (!Float.isNaN(w4g.a)) {
                    abs = (abs * 0.05f) + (0.95f * w4g.a);
                }
                w4g.a = abs;
                if (f - this.noise.a > ((float) this.triggerDiff)) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
