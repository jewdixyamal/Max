package defpackage;

import android.os.Bundle;

/* renamed from: r3g  reason: default package */
public final class r3g implements b64 {
    public static final r3g a = new Object();
    public static final s3g b = s3g.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        s3g.b.getClass();
        if (e64.equals(s3g.c)) {
            return new l64(str, e64, bundle, 1, (j64) null, new ngd(8), 16);
        }
        hm9.p(r3g.class.getName(), "invalid route " + e64, new IllegalArgumentException("invalid route " + e64));
        return null;
    }
}
