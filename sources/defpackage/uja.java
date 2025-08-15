package defpackage;

/* renamed from: uja  reason: default package */
public final class uja extends u2 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ vja o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uja(y5a y5a, vja vja) {
        super(9, (Object) y5a);
        this.o = vja;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f((y5a) obj, (y5a) obj2)) {
                    vja.a(this.o);
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    vja.a(this.o);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uja(defpackage.vja r2) {
        /*
            r1 = this;
            r0 = 1
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uja.<init>(vja):void");
    }
}
