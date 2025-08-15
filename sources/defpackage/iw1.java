package defpackage;

/* renamed from: iw1  reason: default package */
public final /* synthetic */ class iw1 implements l66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ((lw1) this.b).j((l9b) obj);
                return null;
            case 1:
                oq7 oq7 = (oq7) obj;
                oq7.i = (mqb) this.b;
                return oq7;
            case 2:
                Void voidR = (Void) obj;
                ((k8b) this.b).b(p8b.b);
                return null;
            default:
                return (k9b) ((m56) this.b).invoke(obj);
        }
    }
}
