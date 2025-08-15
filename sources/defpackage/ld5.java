package defpackage;

/* renamed from: ld5  reason: default package */
public final /* synthetic */ class ld5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return new q28(((hc5) ((md5) obj).a.get()).a(), new ta4(25), 3);
            default:
                ml0 ml0 = ((v7g) obj).d;
                Object A = ml0.A();
                hm9.m("v7g", "getWorkManager: enable = " + A, new Object[0]);
                Boolean bool = (Boolean) ml0.A();
                if (bool != null && bool.booleanValue()) {
                    return qy9.m(Boolean.TRUE);
                }
                hm9.m("v7g", "waiting for enable ...", new Object[0]);
                return ml0;
        }
    }
}
