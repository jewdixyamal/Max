package defpackage;

/* renamed from: n2e  reason: default package */
public final /* synthetic */ class n2e implements b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Long b;

    public /* synthetic */ n2e(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((d2e) obj).a == this.b.longValue();
            default:
                return ((q3e) obj).a == this.b.longValue();
        }
    }
}
