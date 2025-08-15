package defpackage;

import android.os.Bundle;

/* renamed from: mt7  reason: default package */
public final class mt7 implements b64 {
    public static final mt7 a = new Object();
    public static final nt7 b = nt7.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        k64 ka3;
        if (!b.a.contains(e64)) {
            return null;
        }
        if (e64.equals(nt7.c)) {
            ka3 = new i(22);
        } else if (e64.equals(nt7.d)) {
            ka3 = new ka3(i24.D("id", bundle), 3);
        } else {
            throw new IllegalStateException(au1.f("invalid route ", e64));
        }
        return new l64(str, e64, bundle, 0, (j64) null, ka3, 24);
    }
}
