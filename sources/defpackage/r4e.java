package defpackage;

import android.os.Bundle;

/* renamed from: r4e  reason: default package */
public final class r4e implements b64 {
    public static final r4e a = new Object();
    public static final s4e b = s4e.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!b.a.contains(e64)) {
            return null;
        }
        s4e.b.getClass();
        if (e64.equals(s4e.c)) {
            return new l64(str, e64, bundle, 1, new j64(new xid(13), new xid(14)), new edb(i24.D("sticker_id", bundle), bundle, 2));
        }
        throw new IllegalStateException(au1.f("invalid route ", e64));
    }
}
