package defpackage;

import android.os.Bundle;

/* renamed from: i5e  reason: default package */
public final class i5e implements b64 {
    public static final i5e a = new Object();
    public static final j5e b = j5e.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        j5e.b.getClass();
        if (e64.equals(j5e.c)) {
            return new l64(str, e64, bundle, 1, (j64) null, new m92(bundle, 9), 16);
        }
        throw new IllegalStateException(au1.f("invalid route ", e64));
    }
}
