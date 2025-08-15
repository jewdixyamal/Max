package defpackage;

/* renamed from: uo1  reason: default package */
public final /* synthetic */ class uo1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap1 b;

    public /* synthetic */ uo1(ap1 ap1, int i) {
        this.a = i;
        this.b = ap1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ap1.x(this.b);
            case 1:
                k56 k56 = this.b.Q0;
                if (k56 != null) {
                    return (ugf) k56.invoke();
                }
                return null;
            default:
                return ap1.C(this.b);
        }
    }
}
