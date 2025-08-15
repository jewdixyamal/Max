package defpackage;

import android.os.Bundle;

/* renamed from: j  reason: default package */
public final class j implements b64 {
    public static final j a = new Object();
    public static final k b = k.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        if (e64.equals(k.c)) {
            return new l64(str, e64, bundle, 1, (j64) null, new i(0), 16);
        }
        throw new IllegalStateException(au1.f("Unknown route=", e64));
    }
}
