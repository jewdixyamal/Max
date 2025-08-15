package defpackage;

import android.os.Bundle;

/* renamed from: q89  reason: default package */
public final class q89 implements b64 {
    public static final q89 a = new Object();
    public static final r89 b = r89.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        r89.b.getClass();
        if (e64.equals(r89.c)) {
            return new l64(str, e64, bundle, 0, (j64) null, new i(25), 24);
        }
        hm9.p(q89.class.getName(), "invalid route " + e64, new IllegalArgumentException("invalid route " + e64));
        return null;
    }
}
