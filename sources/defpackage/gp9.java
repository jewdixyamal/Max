package defpackage;

/* renamed from: gp9  reason: default package */
public final /* synthetic */ class gp9 implements m66 {
    public final /* synthetic */ wp9 a;

    public gp9(wp9 wp9) {
        this.a = wp9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gp9) || !(obj instanceof m66)) {
            return false;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    public final f66 getFunctionDelegate() {
        return new o66(1, 0, wp9.class, this.a, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
