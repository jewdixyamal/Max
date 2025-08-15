package defpackage;

import android.view.View;

/* renamed from: cc  reason: default package */
public final class cc extends gmb {
    public final /* synthetic */ int F0;
    public final Object G0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cc(android.content.Context r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r0.F0 = r2
            switch(r2) {
                case 1: goto L_0x0061;
                case 2: goto L_0x0040;
                default: goto L_0x000b;
            }
        L_0x000b:
            ufd r2 = new ufd
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 64
            long r4 = (long) r1
            int r1 = defpackage.yea.C
            eqe r7 = new eqe
            r7.<init>(r1)
            cfd r11 = defpackage.cfd.a
            int r1 = defpackage.woc.f2
            vfd r15 = new vfd
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r14 = 0
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 1816(0x718, float:2.545E-42)
            r3 = r15
            r17 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r17
            r0.G0 = r1
            r2.setModelItem(r1)
            return
        L_0x0040:
            ufd r2 = new ufd
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r0.G0 = r2
            r0 = 56
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.fk4.d()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.tu0.G(r0)
            r2.setMinHeight(r0)
            return
        L_0x0061:
            ufd r2 = new ufd
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r1 = 128(0x80, float:1.794E-43)
            long r4 = (long) r1
            int r1 = defpackage.yea.J
            eqe r7 = new eqe
            r7.<init>(r1)
            cfd r11 = defpackage.cfd.a
            int r1 = defpackage.woc.f2
            vfd r15 = new vfd
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r14 = 0
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r16 = 1816(0x718, float:2.545E-42)
            r3 = r15
            r18 = r15
            r15 = r1
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r18
            r0.G0 = r1
            r2.setModelItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc.<init>(android.content.Context, int):void");
    }

    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                ((ufd) this.a).setModelItem(vfd.k((vfd) this.G0, (cqe) null, new dfd(new iqe(String.valueOf(((nib) ol7).a)), (Integer) null), 1983));
                return;
            case 1:
                ((ufd) this.a).setModelItem(vfd.k((vfd) this.G0, (cqe) null, new dfd(new iqe(String.valueOf(((zib) ol7).a)), (Integer) null), 1983));
                return;
            default:
                au1.r(ol7);
                throw null;
        }
    }

    public final void G(View.OnClickListener onClickListener) {
        switch (this.F0) {
            case 0:
                tu0.K(this.a, 300, onClickListener);
                return;
            case 1:
                tu0.K(this.a, 300, onClickListener);
                return;
            default:
                tu0.K((ufd) this.G0, 300, onClickListener);
                return;
        }
    }

    public void H(View.OnLongClickListener onLongClickListener) {
        switch (this.F0) {
            case 2:
                ((ufd) this.G0).setOnLongClickListener(onLongClickListener);
                return;
            default:
                return;
        }
    }
}
