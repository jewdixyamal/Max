package defpackage;

import android.view.View;

/* renamed from: jw7  reason: default package */
public final class jw7 extends hqd {
    public final /* synthetic */ int F0;
    public final int G0;
    public z2e H0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jw7(android.content.Context r1, defpackage.w2e r2, int r3, int r4) {
        /*
            r0 = this;
            r0.F0 = r4
            switch(r4) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0041;
                default: goto L_0x0005;
            }
        L_0x0005:
            iw7 r4 = new iw7
            r4.<init>(r1)
            r0.<init>(r4)
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r3 = 350(0x15e, float:4.9E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r0.G0 = r1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            vu5 r1 = new vu5
            r3 = 10
            r1.<init>(r0, r3, r2)
            defpackage.tu0.K(r4, 300, r1)
            ad2 r1 = new ad2
            r3 = 2
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        L_0x0041:
            a4g r4 = new a4g
            r4.<init>(r1)
            r0.<init>(r4)
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
            r3 = 350(0x15e, float:4.9E-43)
            int r1 = java.lang.Math.min(r3, r1)
            r0.G0 = r1
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            v7d r1 = new v7d
            r3 = 19
            r1.<init>(r0, r3, r2)
            defpackage.tu0.K(r4, 300, r1)
            ad2 r1 = new ad2
            r3 = 8
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        L_0x007e:
            i2e r4 = new i2e
            r4.<init>(r1)
            r0.<init>(r4)
            r0.G0 = r3
            if (r3 != 0) goto L_0x008c
            r1 = -2
            goto L_0x009c
        L_0x008c:
            float r1 = (float) r3
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = defpackage.tu0.G(r1)
        L_0x009c:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r1)
            r4.setLayoutParams(r3)
            v7d r1 = new v7d
            r3 = 8
            r1.<init>(r0, r3, r2)
            defpackage.tu0.K(r4, 300, r1)
            ad2 r1 = new ad2
            r3 = 6
            r1.<init>(r0, r3, r2)
            r4.setOnLongClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw7.<init>(android.content.Context, w2e, int, int):void");
    }

    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                if (ol7 instanceof z2e) {
                    z2e z2e = (z2e) ol7;
                    this.H0 = z2e;
                    View view = this.a;
                    ((iw7) view).a(z2e, this.G0);
                    ((iw7) view).setAlpha(z2e.w0 ? 0.3f : 1.0f);
                    return;
                }
                return;
            case 1:
                if (ol7 instanceof z2e) {
                    z2e z2e2 = (z2e) ol7;
                    this.H0 = z2e2;
                    int i = this.G0;
                    View view2 = this.a;
                    if (i == 0) {
                        ((i2e) view2).setSizeConfigurator(new f4e(view2));
                    }
                    ((i2e) view2).a(z2e2);
                    ((i2e) view2).setAlpha(z2e2.w0 ? 0.3f : 1.0f);
                    return;
                }
                return;
            default:
                if (ol7 instanceof z2e) {
                    z2e z2e3 = (z2e) ol7;
                    this.H0 = z2e3;
                    View view3 = this.a;
                    ((a4g) view3).a(z2e3, this.G0);
                    ((a4g) view3).setAlpha(z2e3.w0 ? 0.3f : 1.0f);
                    return;
                }
                return;
        }
    }

    public final void B(ol7 ol7, Object obj) {
        switch (this.F0) {
            case 0:
                if (!(obj instanceof y2e)) {
                    A(ol7);
                    return;
                } else {
                    ((iw7) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                    return;
                }
            case 1:
                if (!(obj instanceof y2e)) {
                    A(ol7);
                    return;
                } else {
                    ((i2e) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                    return;
                }
            default:
                if (!(obj instanceof y2e)) {
                    A(ol7);
                    return;
                }
                ((a4g) this.a).setAlpha(((y2e) obj).a ? 0.3f : 1.0f);
                return;
        }
    }
}
