package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ns3  reason: default package */
public final class ns3 implements bde {
    public final el3 a;
    public final kke b;
    public final ece c;
    public final khe d = new khe(new yf3(this));
    public final q40 e;

    public ns3(j92 j92, el3 el3, kke kke, b0d b0d, ida ida, m7b m7b, u7b u7b) {
        je7 je7 = iyc.z;
        this.a = el3;
        this.b = kke;
        this.c = new ece(j92);
        this.e = new q40(b0d, new bdb((Object) b0d, 7, (Object) ida), m7b, u7b, je7, new v02(25, this));
    }

    public final q1a a(int i, String str) {
        return new q1a(1, new vpc((lx3) hz4.a, new ms3(this, str, i, (Continuation) null)));
    }

    public final List b(LinkedHashSet linkedHashSet) {
        this.c.getClass();
        return this.e.l(linkedHashSet);
    }

    public final void clear() {
    }
}
