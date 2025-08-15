package defpackage;

import android.os.Bundle;

/* renamed from: oyd  reason: default package */
public final class oyd implements b64 {
    public static final oyd a = new Object();
    public static final qyd b = qyd.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        lq lqVar;
        k64 ka3;
        if (!b.a.contains(e64)) {
            return null;
        }
        qyd.b.getClass();
        if (e64.equals(qyd.c)) {
            ka3 = new ngd(1);
        } else if (e64.equals(qyd.d)) {
            ka3 = new ngd(2);
        } else if (e64.equals(qyd.e)) {
            ka3 = new ngd(3);
        } else if (e64.equals(qyd.f)) {
            lqVar = new lq(3, i24.w("ids", bundle));
            return new l64(str, e64, bundle, 1, (j64) null, lqVar, 16);
        } else if (e64.equals(qyd.g)) {
            ka3 = new ka3(i24.D("id", bundle), 9);
        } else {
            hm9.p(oyd.class.getName(), "invalid route " + e64, new IllegalArgumentException("invalid route " + e64));
            return null;
        }
        lqVar = ka3;
        return new l64(str, e64, bundle, 1, (j64) null, lqVar, 16);
    }
}
