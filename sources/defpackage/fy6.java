package defpackage;

import android.os.SystemClock;

/* renamed from: fy6  reason: default package */
public final /* synthetic */ class fy6 implements m56 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;

    public /* synthetic */ fy6(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        String str = fz6.E0;
        int i = this.b;
        if (th == null) {
            hm9.m(str, "prefetch " + i + " completed, all time = " + elapsedRealtime + "ms", new Object[0]);
        } else {
            hm9.p(str, "prefetch " + i + " completion error, all time = " + elapsedRealtime + "ms", th);
        }
        return e5f.a;
    }
}
