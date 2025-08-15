package defpackage;

import android.os.Bundle;

/* renamed from: a7e  reason: default package */
public final class a7e implements b64 {
    public static final a7e a = new Object();
    public static final b7e b = b7e.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        b7e.b.getClass();
        if (e64.equals(b7e.c)) {
            return new l64(str, e64, bundle, 1, (j64) null, new m92(bundle, 10), 16);
        }
        throw new IllegalStateException(au1.f("invalid route ", e64));
    }
}
