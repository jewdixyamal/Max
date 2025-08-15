package defpackage;

/* renamed from: or  reason: default package */
public final /* synthetic */ class or implements x52, m66 {
    public final /* synthetic */ zr a;

    public or(zr zrVar) {
        this.a = zrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x52) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(1, 0, zr.class, this.a, "backgroundSelected", "backgroundSelected(Lone/me/appearancesettings/singletheme/model/ChatBackground;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
