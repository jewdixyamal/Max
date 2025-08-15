package defpackage;

import android.os.SystemClock;

/* renamed from: d9f  reason: default package */
public final class d9f {
    public final /* synthetic */ int a;

    public /* synthetic */ d9f(int i) {
        this.a = i;
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
