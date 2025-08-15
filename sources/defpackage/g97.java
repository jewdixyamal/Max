package defpackage;

import android.os.Bundle;

/* renamed from: g97  reason: default package */
public final class g97 implements b64 {
    public static final g97 a = new Object();
    public static final h97 b = h97.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        j64 j64 = new j64(new m57(5), new m57(6));
        h97.b.getClass();
        if (e64.equals(h97.c)) {
            return new l64(str, e64, bundle, 0, j64, new m92(bundle, 5), 8);
        }
        throw new IllegalStateException(au1.f("unknown screen ", e64));
    }
}
