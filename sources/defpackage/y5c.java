package defpackage;

/* renamed from: y5c  reason: default package */
public final class y5c extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ z5c o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5c(v5c v5c, z5c z5c) {
        super(9, (Object) v5c);
        this.c = 1;
        this.o = z5c;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    z5c z5c = this.o;
                    if (booleanValue || !booleanValue2) {
                        z5c.invalidate();
                        return;
                    } else {
                        z5c.a(true);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (!tpa.f(obj, obj2)) {
                    v5c v5c = (v5c) obj;
                    this.o.w0.setText(((v5c) obj2).a);
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    this.o.x0.g(intValue, true);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y5c(defpackage.z5c r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 2: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y5c.<init>(z5c, int):void");
    }
}
