package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pza  reason: default package */
public final class pza extends pnf {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final q0e Y = r0e.a((Object) null);
    public final w4d Z = mqd.D();
    public final long b;
    public final mp8 c;
    public final kq8 o;

    static {
        oi9 oi9 = new oi9(pza.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        s0 = new bc7[]{oi9};
    }

    public pza(long j, mp8 mp8, kq8 kq8, je7 je7) {
        this.b = j;
        this.c = mp8;
        this.o = kq8;
        this.X = je7;
        xp8 xp8 = (xp8) mp8;
        if (xp8.g.compareAndSet(false, true)) {
            j47.T(xp8.f, (lx3) null, (vx3) null, new wp8(xp8, (Continuation) null), 3);
        }
        od2.L(new zn5(((xp8) kq8).l, new mza(this, (Continuation) null), 5), this.a);
    }

    public static final ArrayList q(pza pza, List list) {
        pza.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            pxa pxa = (pxa) next;
            e52 e52 = (e52) ((jz2) ((iy2) pza.X.getValue())).m(pza.b).a.getValue();
            if (e52 != null) {
                ArrayList j = e52.j();
                if (!j.isEmpty()) {
                    Iterator it = j.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((uj3) it.next()).n() == pxa.a) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = (defpackage.e52) ((defpackage.jz2) ((defpackage.iy2) r4.X.getValue())).m(r2).a.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r4 = this;
            r0 = 0
            long r2 = r4.b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            je7 r4 = r4.X
            java.lang.Object r4 = r4.getValue()
            iy2 r4 = (defpackage.iy2) r4
            jz2 r4 = (defpackage.jz2) r4
            w7c r4 = r4.m(r2)
            j0e r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            e52 r4 = (defpackage.e52) r4
            if (r4 == 0) goto L_0x002d
            java.util.ArrayList r4 = r4.j()
            boolean r4 = r4.isEmpty()
            r0 = 1
            r4 = r4 ^ r0
            if (r4 != r0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pza.r():boolean");
    }
}
