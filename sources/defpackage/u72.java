package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: u72  reason: default package */
public final /* synthetic */ class u72 implements qj3, xha {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u72(p82 p82, long j, cu8 cu8, long j2) {
        this.c = p82;
        this.a = j;
        this.o = cu8;
        this.b = j2;
    }

    public void I(yha yha) {
        if (yha == yha.X) {
            y0b y0b = (y0b) this.c;
            j47.T(y0b.d, ((w9a) y0b.b).b(), (vx3) null, new v0b(y0b, (e52) this.o, this.a, this.b, (Continuation) null), 2);
        }
    }

    public void accept(Object obj) {
        es8 es8;
        u82 u82 = (u82) obj;
        p82 p82 = (p82) this.c;
        p82.getClass();
        if (u82.a == 0) {
            u82.a = this.a;
        }
        cu8 cu8 = (cu8) this.o;
        boolean x = cu8.x();
        long j = this.b;
        if (x) {
            p82.R(j, u82, cu8);
        }
        e92 e92 = u82.n;
        ng4 ng4 = cu8.T0;
        long j2 = ng4 != null ? ng4.a : cu8.o;
        mg4 mg4 = cu8.U0;
        if (e92.c(mg4) == 0) {
            e92.a(new d92(j2, j2), mg4);
        } else {
            kpa w = hm9.w(e92.d(mg4));
            d92 d92 = (d92) w.b;
            if (d92.b < j2) {
                l7 c2 = d92.c();
                c2.b(j2);
                e92.d(mg4).remove(((Integer) w.a).intValue());
                e92.e(mg4);
                e92.a(c2.a(), mg4);
            }
        }
        mg4 mg42 = mg4.REGULAR;
        if (mg4 == mg42) {
            e52 C = p82.C(j);
            if (!(C == null || (es8 = C.c) == null || es8.a.c >= cu8.c)) {
                p82.l0(u82, cu8);
            }
            if (C != null) {
                k92 k92 = C.b;
                if (k92.x == 0 && k92.n.c(mg42) == 0) {
                    p82.v(j, u82, 0);
                }
            }
            if (C != null && C.n() < cu8.k() && C.b.m == 0) {
                long K = p82.K();
                Map d = u82.d();
                if (((Long) u82.d().get(Long.valueOf(K))) != null) {
                    d.put(Long.valueOf(K), Long.valueOf(cu8.k()));
                    u82.e = d;
                }
            }
        }
    }

    public /* synthetic */ u72(y0b y0b, e52 e52, long j, long j2) {
        this.c = y0b;
        this.o = e52;
        this.a = j;
        this.b = j2;
    }
}
