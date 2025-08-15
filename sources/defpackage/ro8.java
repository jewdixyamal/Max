package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ro8  reason: default package */
public final class ro8 extends pnf {
    public final s35 X;
    public final s35 Y;
    public final q0e Z;
    public final m56 b;
    public final pc4 c;
    public final k56 o;
    public final w7c s0;
    public final q0e t0;
    public final w7c u0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ro8(m56 m56, d9 d9Var, int i) {
        this(m56, (i & 2) != 0 ? (pc4) ko8.a.getAccessor().c(pc4.class) : d9Var, (k56) new j78(6));
    }

    public final void q() {
        this.Z.setValue((Object) null);
    }

    public final boolean r() {
        return this.s0.a.getValue() != null;
    }

    public final void s(List list) {
        pnf.o(this.Y, new ho8(list));
    }

    public final void t(long j, boolean z) {
        q0e q0e;
        Object value;
        Set G0;
        if (!r()) {
            pnf.o(this.X, new mo8(j));
        } else if (z) {
            do {
                q0e = this.Z;
                value = q0e.getValue();
                Set set = (Set) value;
                G0 = set != null ? x53.G0(set) : new LinkedHashSet();
                if (G0.contains(Long.valueOf(j))) {
                    G0.remove(Long.valueOf(j));
                } else {
                    G0.add(Long.valueOf(j));
                }
            } while (!q0e.c(value, G0));
        }
    }

    public final void u(String str) {
        this.t0.setValue(str);
    }

    public ro8(m56 m56, pc4 pc4, k56 k56) {
        this.b = m56;
        this.c = pc4;
        this.o = k56;
        this.X = new s35(0);
        this.Y = new s35(0);
        q0e a = r0e.a((Object) null);
        this.Z = a;
        this.s0 = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.t0 = a2;
        this.u0 = new w7c(a2);
    }
}
