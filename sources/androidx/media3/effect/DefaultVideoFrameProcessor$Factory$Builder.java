package androidx.media3.effect;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class DefaultVideoFrameProcessor$Factory$Builder {
    public int a = 0;
    public ExecutorService b;
    public va8 c;
    public id6 d;
    public int e;
    public boolean f = true;

    public qf4 build() {
        int i = this.a;
        boolean z = !this.f;
        va8 va8 = this.c;
        if (va8 == null) {
            va8 = new va8(15, (byte) 0);
        }
        return new qf4(i, z, va8, (ScheduledExecutorService) this.b, (hd0) this.d, this.e);
    }
}
