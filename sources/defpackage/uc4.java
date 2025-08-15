package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* renamed from: uc4  reason: default package */
public final class uc4 implements v1d {
    public final /* synthetic */ vc4 a;

    public uc4(vc4 vc4) {
        this.a = vc4;
    }

    public final boolean c() {
        return true;
    }

    public final t1d e(long j) {
        vc4 vc4 = this.a;
        BigInteger valueOf = BigInteger.valueOf((((long) ((a9e) vc4.x0).f) * j) / 1000000);
        long j2 = vc4.c;
        long j3 = vc4.b;
        z1d z1d = new z1d(j, oaf.k((valueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(vc4.X)).longValue() + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, vc4.b, j2 - 1));
        return new t1d(z1d, z1d);
    }

    public final long f() {
        vc4 vc4 = this.a;
        return (vc4.X * 1000000) / ((long) ((a9e) vc4.x0).f);
    }
}
