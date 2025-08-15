package defpackage;

/* renamed from: jk7  reason: default package */
public final /* synthetic */ class jk7 implements m66 {
    public final /* synthetic */ kk7 a;

    public jk7(kk7 kk7) {
        this.a = kk7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jk7) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(2, 0, kk7.class, this.a, "onMessageElementClick", "onMessageElementClick(Landroid/view/View;Lru/ok/tamtam/models/MessageElementData;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
