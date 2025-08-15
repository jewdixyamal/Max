package defpackage;

/* renamed from: hea  reason: default package */
public final class hea extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ iea o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hea(defpackage.iea r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            gea r2 = defpackage.gea.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            fea r2 = defpackage.fea.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hea.<init>(iea, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    gea gea = (gea) obj2;
                    gea gea2 = (gea) obj;
                    this.o.c();
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    fea fea = (fea) obj2;
                    fea fea2 = (fea) obj;
                    this.o.b();
                    return;
                }
                return;
        }
    }
}
