package defpackage;

/* renamed from: zo1  reason: default package */
public final class zo1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ap1 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zo1(defpackage.ap1 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            yo1 r2 = defpackage.yo1.b
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r0.o = r1
            r1 = 0
            r2 = 9
            r0.<init>((int) r2, (java.lang.Object) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo1.<init>(ap1, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((yo1) obj) != ((yo1) obj2)) {
                    ap1.E(this.o);
                    return;
                }
                return;
            default:
                fka fka = (fka) obj2;
                if (!tpa.f((fka) obj, fka)) {
                    ap1 ap1 = this.o;
                    if (fka == null) {
                        fka = qp4.u0.j(ap1);
                    }
                    ap1.onThemeChanged(fka);
                    return;
                }
                return;
        }
    }
}
