package defpackage;

import android.os.Bundle;

/* renamed from: ogd  reason: default package */
public final class ogd implements b64 {
    public static final ogd a = new Object();
    public static final pgd b = pgd.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        pgd.b.getClass();
        if (e64.equals(pgd.c)) {
            return new l64(str, e64, bundle, 0, (j64) null, new ngd(0), 24);
        }
        hm9.p(ogd.class.getName(), "invalid route " + e64, new IllegalArgumentException("invalid route " + e64));
        return null;
    }
}
