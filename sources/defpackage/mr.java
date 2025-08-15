package defpackage;

/* renamed from: mr  reason: default package */
public final /* synthetic */ class mr implements m66 {
    public final /* synthetic */ zr a;

    public mr(zr zrVar) {
        this.a = zrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mr) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(1, 0, zr.class, this.a, "modeSelected", "modeSelected(Lone/me/appearancesettings/singletheme/model/AppearanceMode;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
