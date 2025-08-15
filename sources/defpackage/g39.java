package defpackage;

import java.util.List;

/* renamed from: g39  reason: default package */
public final class g39 extends pnf {
    public final w7c X;
    public final q0e Y;
    public final w7c Z;
    public final q0e b;
    public final w7c c;
    public final q0e o;
    public final s35 s0 = new s35(0);
    public final s35 t0 = new s35(0);

    public g39() {
        q0e a = r0e.a(Boolean.FALSE);
        this.b = a;
        this.c = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.o = a2;
        this.X = new w7c(a2);
        q0e a3 = r0e.a((Object) null);
        this.Y = a3;
        this.Z = new w7c(a3);
    }

    public final void q(kpa kpa) {
        q0e q0e;
        Object value;
        do {
            q0e = this.o;
            value = q0e.getValue();
            jk6 jk6 = (jk6) value;
        } while (!q0e.c(value, kpa == null ? null : new jk6(((Number) kpa.a).longValue(), (List) kpa.b)));
    }
}
