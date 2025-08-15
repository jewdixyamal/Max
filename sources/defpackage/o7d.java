package defpackage;

/* renamed from: o7d  reason: default package */
public final /* synthetic */ class o7d implements m66 {
    public final /* synthetic */ oo6 a;

    public o7d(oo6 oo6) {
        this.a = oo6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7d) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new v8(1, 8, oo6.class, this.a, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
