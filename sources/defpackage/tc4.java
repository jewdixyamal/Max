package defpackage;

import androidx.work.WorkRequest;

/* renamed from: tc4  reason: default package */
public final class tc4 implements u1d {
    public final /* synthetic */ vc4 a;

    public tc4(vc4 vc4) {
        this.a = vc4;
    }

    public final boolean c() {
        return true;
    }

    public final s1d e(long j) {
        vc4 vc4 = this.a;
        long j2 = vc4.c;
        long j3 = vc4.b;
        y1d y1d = new y1d(j, maf.k(((((j2 - j3) * ((((long) ((a9e) vc4.x0).f) * j) / 1000000)) / vc4.X) + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j3, j2 - 1));
        return new s1d(y1d, y1d);
    }

    public final long f() {
        vc4 vc4 = this.a;
        return (vc4.X * 1000000) / ((long) ((a9e) vc4.x0).f);
    }
}
