package defpackage;

import android.os.Bundle;

/* renamed from: u71  reason: default package */
public final class u71 implements b64 {
    public static final u71 a = new Object();
    public static final v71 b = v71.b;

    public final i64 a() {
        return b;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        i iVar;
        if (!b.a.contains(e64)) {
            return null;
        }
        v71.b.getClass();
        if (e64.equals(v71.c)) {
            iVar = new i(6);
        } else if (e64.equals(v71.d)) {
            String string = bundle.getString("call_link");
            String string2 = bundle.getString("call_title");
            Long v = i24.v("call_chat_id", bundle);
            Boolean u = i24.u("is_link_call", bundle);
            iVar = new t71(v, string, string2, u != null ? u.booleanValue() : false);
        } else {
            throw new IllegalStateException(au1.f("invalid route ", e64));
        }
        return new l64(str, e64, bundle, 0, (j64) null, iVar, 24);
    }
}
