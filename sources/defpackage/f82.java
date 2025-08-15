package defpackage;

import java.util.Collections;

/* renamed from: f82  reason: default package */
public final /* synthetic */ class f82 implements qj3 {
    public final /* synthetic */ p82 a;
    public final /* synthetic */ cu8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long o;

    public /* synthetic */ f82(p82 p82, cu8 cu8, boolean z, long j) {
        this.a = p82;
        this.b = cu8;
        this.c = z;
        this.o = j;
    }

    public final void accept(Object obj) {
        u82 u82 = (u82) obj;
        p82 p82 = this.a;
        p82.getClass();
        cu8 cu8 = this.b;
        if (cu8 == null) {
            u82.j = 0;
        } else {
            cu8 q = ((au8) p82.s.get()).q(u82.j);
            if (this.c || q == null || cu8.o > q.o) {
                p82.l0(u82, cu8);
            }
        }
        p82.m.c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true));
    }
}
