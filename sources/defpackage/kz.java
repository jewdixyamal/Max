package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: kz  reason: default package */
public final class kz {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;

    public kz(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78) {
        this.a = je72;
        this.b = je7;
        this.c = je73;
        this.d = je74;
        this.e = je76;
        this.f = je75;
        this.g = je77;
        this.h = je78;
    }

    public static Object b(kz kzVar, cu8 cu8, boolean z, Long l, int i, hu3 hu3, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            l = null;
        }
        return j47.t0(((w9a) ((kke) kzVar.d.getValue())).b(), new jz(kzVar, cu8, (i2 & 8) != 0 ? 0 : i, l, z2, (Continuation) null), hu3);
    }

    public final Context a() {
        return (Context) this.f.getValue();
    }
}
