package defpackage;

import android.os.Bundle;

/* renamed from: m95  reason: default package */
public final class m95 implements b64 {
    public static final m95 a = new Object();
    public static final n95 b = n95.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        n95.b.getClass();
        if (e64.equals(n95.c)) {
            return new l64(str, e64, bundle, 0, (j64) null, new m92(bundle, 2), 24);
        }
        throw new IllegalStateException(au1.f("unknown screen ", e64));
    }
}
