package defpackage;

/* renamed from: y5b  reason: default package */
public final /* synthetic */ class y5b implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6b b;

    public /* synthetic */ y5b(f6b f6b, int i) {
        this.a = i;
        this.b = f6b;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                f6b.b(this.b, floatValue);
                return e5f.a;
            case 1:
                f6b.c(this.b, floatValue, f.floatValue());
                return e5f.a;
            default:
                f.getClass();
                f6b.a(this.b, floatValue);
                return e5f.a;
        }
    }
}
