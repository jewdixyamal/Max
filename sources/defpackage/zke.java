package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: zke  reason: default package */
public final class zke implements b99 {
    public final o45 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final ContextScope h;
    public final String i = zke.class.getName();
    public final khe j = new khe(new xid(28));

    public zke(o45 o45, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, kke kke, je7 je77) {
        this.a = o45;
        this.b = je7;
        this.c = je72;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        new khe(new dr(je73, je74, 10));
        this.g = je77;
        this.h = j1e.a(((w9a) kke).b().limitedParallelism(2, "cloud-pushes").plus(new qj(o45)));
    }

    public final ale a() {
        return (ale) this.b.getValue();
    }
}
