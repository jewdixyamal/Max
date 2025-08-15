package defpackage;

/* renamed from: cse  reason: default package */
public final /* synthetic */ class cse implements m66 {
    public final /* synthetic */ lse a;

    public cse(lse lse) {
        this.a = lse;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cse) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new v8(1, 8, lse.class, this.a, "onNewTheme", "onNewTheme(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
