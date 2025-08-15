package defpackage;

/* renamed from: via  reason: default package */
public final class via extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wia o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public via(defpackage.wia r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            lia r2 = defpackage.lia.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            ria r2 = defpackage.ria.a
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.via.<init>(wia, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                oia oia = (oia) obj2;
                if (!tpa.f((oia) obj, oia)) {
                    wia wia = this.o;
                    wia.setLeft(oia);
                    wia.y();
                    return;
                }
                return;
            default:
                tia tia = (tia) obj2;
                if (!tpa.f((tia) obj, tia)) {
                    wia wia2 = this.o;
                    wia2.setRight(tia);
                    wia2.y();
                    return;
                }
                return;
        }
    }
}
