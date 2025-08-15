package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* renamed from: cf1  reason: default package */
public final class cf1 extends ppd {
    public final ey1 X;
    public final Executor Y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cf1(defpackage.ey1 r2) {
        /*
            r1 = this;
            jyc r0 = defpackage.jyc.a
            iba r0 = r0.p()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1.<init>(r0)
            r1.X = r2
            r1.Y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf1.<init>(ey1):void");
    }

    public final int l(int i) {
        return ((ol7) this.o.f.get(i)).l();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.dec r4, int r5, java.util.List r6) {
        /*
            r3 = this;
            hqd r4 = (defpackage.hqd) r4
            boolean r0 = r6.isEmpty()
            iv r3 = r3.o
            if (r0 == 0) goto L_0x0017
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            ol7 r3 = (defpackage.ol7) r3
            r4.A(r3)
            goto L_0x00c8
        L_0x0017:
            java.util.List r0 = r3.f
            java.lang.Object r0 = r0.get(r5)
            ol7 r0 = (defpackage.ol7) r0
            int r0 = r0.l()
            r1 = 1
            if (r0 != r1) goto L_0x00bd
            bf1 r4 = (defpackage.bf1) r4
            at r3 = new at
            r5 = 2
            r3.<init>(r5, r6)
            we1 r5 = new we1
            r6 = 1
            r5.<init>(r6)
            um5 r6 = new um5
            n6d r0 = defpackage.n6d.a
            r6.<init>(r3, r5, r0)
            n71 r3 = defpackage.n71.X
            qk5 r3 = defpackage.l6d.Z(r6, r3)
            pk5 r5 = new pk5
            r5.<init>((defpackage.qk5) r3)
        L_0x0046:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r5.next()
            ue1 r3 = (defpackage.ue1) r3
            boolean r6 = r3 instanceof defpackage.se1
            android.view.View r0 = r4.a
            if (r6 == 0) goto L_0x0062
            lk3 r0 = (defpackage.lk3) r0
            se1 r3 = (defpackage.se1) r3
            java.lang.String r3 = r3.a
            r0.setName((java.lang.CharSequence) r3)
            goto L_0x0046
        L_0x0062:
            boolean r6 = r3 instanceof defpackage.qe1
            r1 = 0
            if (r6 == 0) goto L_0x007f
            lk3 r0 = (defpackage.lk3) r0
            qe1 r3 = (defpackage.qe1) r3
            java.lang.Integer r3 = r3.a
            if (r3 == 0) goto L_0x007b
            int r3 = r3.intValue()
            android.content.Context r6 = r0.getContext()
            java.lang.String r1 = r6.getString(r3)
        L_0x007b:
            r0.setMessage(r1)
            goto L_0x0046
        L_0x007f:
            boolean r6 = r3 instanceof defpackage.pe1
            if (r6 == 0) goto L_0x0093
            lk3 r0 = (defpackage.lk3) r0
            pe1 r3 = (defpackage.pe1) r3
            gg1 r6 = r3.a
            long r1 = r6.a
            java.lang.String r6 = r3.b
            java.lang.String r3 = r3.c
            r0.O(r1, r6, r3)
            goto L_0x0046
        L_0x0093:
            boolean r6 = r3 instanceof defpackage.re1
            if (r6 == 0) goto L_0x00a1
            re1 r3 = (defpackage.re1) r3
            boolean r6 = r3.a
            gg1 r3 = r3.b
            r4.E(r3, r6)
            goto L_0x0046
        L_0x00a1:
            boolean r6 = r3 instanceof defpackage.te1
            if (r6 == 0) goto L_0x00b7
            te1 r3 = (defpackage.te1) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L_0x00b1
            int r3 = defpackage.x7a.J
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x00b1:
            lk3 r0 = (defpackage.lk3) r0
            r0.setIconInfo(r1)
            goto L_0x0046
        L_0x00b7:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x00bd:
            java.util.List r3 = r3.f
            java.lang.Object r3 = r3.get(r5)
            ol7 r3 = (defpackage.ol7) r3
            r4.A(r3)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cf1.s(dec, int, java.util.List):void");
    }

    public final dec t(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new bf1(viewGroup.getContext(), this.X);
        }
        throw new IllegalArgumentException(wg0.g(i, "Not supported viewType=", " for CallOpponentsListAdapter"));
    }
}
