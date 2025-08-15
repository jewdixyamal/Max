package defpackage;

/* renamed from: cr  reason: default package */
public final /* synthetic */ class cr implements m66 {
    public final /* synthetic */ kr a;

    public cr(kr krVar) {
        this.a = krVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cr) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(1, 0, kr.class, this.a, "selectTheme", "selectTheme(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
