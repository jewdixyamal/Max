package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o89  reason: default package */
public final class o89 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public o89(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
    }

    public static /* synthetic */ Object b(o89 o89, long j, CharSequence charSequence, Long l, cz5 cz5, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            cz5 = null;
        }
        return o89.a(j, charSequence, l, cz5, false, continuation);
    }

    public final Object a(long j, CharSequence charSequence, Long l, cz5 cz5, boolean z, Continuation continuation) {
        Object t0 = j47.t0(((w9a) ((kke) this.a.getValue())).b(), new n89(this, j, charSequence, l, z, cz5, (Continuation) null), continuation);
        return t0 == tx3.a ? t0 : e5f.a;
    }
}
