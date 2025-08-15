package defpackage;

/* renamed from: us8  reason: default package */
public final class us8 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vs8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us8(Object obj, vs8 vs8, int i) {
        super(9, obj);
        this.c = i;
        this.o = vs8;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    int[] iArr = (int[]) obj;
                    vs8 vs8 = this.o;
                    vs8.d((int[]) obj2, vs8.getBounds());
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    int[] iArr2 = (int[]) obj;
                    vs8 vs82 = this.o;
                    vs82.e((int[]) obj2, vs82.getBounds());
                    return;
                }
                return;
        }
    }
}
