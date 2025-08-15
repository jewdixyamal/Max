package defpackage;

/* renamed from: sk7  reason: default package */
public final /* synthetic */ class sk7 implements b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl7 b;

    public /* synthetic */ sk7(fl7 fl7, int i) {
        this.a = i;
        this.b = fl7;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return this.b.j.equalsIgnoreCase(str);
            default:
                return this.b.m.equalsIgnoreCase(str);
        }
    }
}
