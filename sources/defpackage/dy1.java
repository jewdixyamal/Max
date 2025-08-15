package defpackage;

/* renamed from: dy1  reason: default package */
public final /* synthetic */ class dy1 implements g2a, m66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ dy1(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof g2a) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof g2a) || !(obj instanceof m66)) {
                    return false;
                }
                return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
    }

    public final f66 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
