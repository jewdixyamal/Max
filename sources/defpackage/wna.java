package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* renamed from: wna  reason: default package */
public final class wna extends vna {
    public final Object c() {
        Object obj = this.a;
        c54.k(obj instanceof OutputConfiguration);
        return obj;
    }

    public final void e(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    public final void f(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    public final void h(long j) {
        if (j != -1) {
            ((OutputConfiguration) c()).setStreamUseCase(j);
        }
    }
}
