package defpackage;

/* renamed from: zlf  reason: default package */
public final class zlf extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ amf o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zlf(amf amf, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                ulf ulf = ulf.a;
                this.o = amf;
                super(9, (Object) ulf);
                return;
            default:
                this.o = amf;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    xlf xlf = (xlf) obj2;
                    xlf xlf2 = (xlf) obj;
                    this.o.requestLayout();
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    ulf ulf = (ulf) obj2;
                    ulf ulf2 = (ulf) obj;
                    this.o.requestLayout();
                    return;
                }
                return;
        }
    }
}
