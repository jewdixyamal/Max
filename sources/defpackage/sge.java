package defpackage;

/* renamed from: sge  reason: default package */
public final /* synthetic */ class sge implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uge b;

    public /* synthetic */ sge(uge uge, int i) {
        this.a = i;
        this.b = uge;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                uge.a(this.b, floatValue);
                return e5f.a;
            default:
                uge.b(this.b, floatValue, f.floatValue());
                return e5f.a;
        }
    }
}
