package defpackage;

import android.os.Bundle;

/* renamed from: lz2  reason: default package */
public final class lz2 implements b64 {
    public static final lz2 a = new Object();
    public static final mz2 b = mz2.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        j64 j64 = new j64(new hn2(11), new hn2(12));
        if (e64.equals(mz2.c)) {
            return new l64(str, e64, bundle, 1, j64, new i(7));
        }
        throw new IllegalStateException(au1.f("invalid route ", e64));
    }
}
