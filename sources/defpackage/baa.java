package defpackage;

import android.content.res.ColorStateList;

/* renamed from: baa  reason: default package */
public final class baa extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ caa o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public baa(defpackage.caa r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x0023;
                case 3: goto L_0x0019;
                case 4: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            du4 r2 = defpackage.du4.b
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0019:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x0023:
            x9a r2 = defpackage.x9a.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baa.<init>(caa, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    caa caa = this.o;
                    if (!caa.D0) {
                        caa.a(caa.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    caa caa2 = this.o;
                    if (!caa2.D0) {
                        caa2.a(caa2.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9 = qp4.u0;
                    caa caa3 = this.o;
                    caa3.f(pq9.j(caa3));
                    return;
                }
                return;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    caa caa4 = this.o;
                    if (booleanValue) {
                        caa4.C0.setStroke(tu0.F(((double) fk4.d().getDisplayMetrics().density) * 1.5d), qp4.u0.j(caa4).i().a.a.a);
                        return;
                    } else {
                        caa4.C0.setStroke(tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), (ColorStateList) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    caa caa5 = this.o;
                    caa5.setBackground(booleanValue2 ? caa5.C0 : null);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public baa(Object obj, caa caa) {
        super(9, obj);
        this.c = 1;
        this.o = caa;
    }
}
