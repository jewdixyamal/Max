package defpackage;

import android.os.Bundle;

/* renamed from: q6e  reason: default package */
public final class q6e implements b64 {
    public static final q6e a = new Object();
    public static final r6e b = r6e.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        k64 ka3;
        if (!b.a.contains(e64)) {
            return null;
        }
        Long v = i24.v("set_id", bundle);
        long longValue = v != null ? v.longValue() : -1;
        r6e.b.getClass();
        if (e64.equals(r6e.c)) {
            ka3 = new ngd(4);
        } else if (e64.equals(r6e.d)) {
            ka3 = new ngd(5);
        } else if (e64.equals(r6e.e)) {
            ka3 = new ngd(6);
        } else if (e64.equals(r6e.f)) {
            ka3 = new ka3(longValue, 10);
        } else {
            throw new IllegalStateException(au1.f("invalid route ", e64));
        }
        return new l64(str, e64, bundle, 1, (j64) null, ka3, 16);
    }
}
