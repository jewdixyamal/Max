package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ab6  reason: default package */
public final class ab6 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ab6(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    public static Object a(ab6 ab6, long j, Continuation continuation) {
        int i = ft4.o;
        return j47.t0(((w9a) ((kke) ab6.c.getValue())).b(), new za6(ab6, j, z7.R(3, kt4.SECONDS), true, (Continuation) null), continuation);
    }
}
