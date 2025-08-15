package defpackage;

import android.view.View;

/* renamed from: nq2  reason: default package */
public final /* synthetic */ class nq2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nq2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                pnf.o(((rq2) this.c).b1, new fp2(6, this.b, 0, (String) null));
                return e5f.a;
            case 1:
                Long l = (Long) obj;
                return r0e.a((uj3) ((ds3) this.c).a.a.get(Long.valueOf(this.b)));
            case 2:
                Long l2 = (Long) obj;
                return r0e.a(((blb) this.c).e.get(Long.valueOf(this.b)));
            case 3:
                if (((yha) obj) != yha.X) {
                    cnb cnb = (cnb) this.c;
                    pab pab = cnb.O0;
                    boolean z = pab.p() && pab.q();
                    long j = this.b;
                    ((s8g) cnb.X.getValue()).a(new g8d(j, z));
                    if (z) {
                        pnf.o(cnb.A0, new nkb(j, cnb.b));
                    }
                }
                return e5f.a;
            default:
                ((Long) obj).getClass();
                b8e b8e = (b8e) this.c;
                int i = 0;
                for (Object next : ((l7e) b8e.t0.getValue()).b) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ol7 ol7 = (ol7) next;
                        boolean z2 = ol7 instanceof w3e;
                        long j2 = this.b;
                        if ((z2 && ((w3e) ol7).a == j2) || ((ol7 instanceof e02) && ((e02) ol7).b.a == j2)) {
                            b8e.w0.m((Object) null, new k7e(j2, i, 0, 4));
                        }
                        i = i2;
                    } else {
                        y53.R();
                        throw null;
                    }
                }
                return e5f.a;
        }
    }
}
