package defpackage;

import android.os.Bundle;

/* renamed from: qp  reason: default package */
public final class qp implements b64 {
    public static final qp a = new Object();
    public static final rp b = rp.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        if (e64.equals(rp.c)) {
            return new l64(str, e64, bundle, 1, (j64) null, new i(1), 16);
        }
        throw new IllegalStateException(au1.f("Unknown route=", e64));
    }
}
