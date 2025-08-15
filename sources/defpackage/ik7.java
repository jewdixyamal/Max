package defpackage;

/* renamed from: ik7  reason: default package */
public final /* synthetic */ class ik7 implements m66 {
    public final /* synthetic */ kk7 a;

    public ik7(kk7 kk7) {
        this.a = kk7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ik7) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(2, 0, kk7.class, this.a, "onProfileTagClicked", "onProfileTagClicked(Landroid/view/View;Ljava/lang/String;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
