package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ProfileAvatarWidget;

/* renamed from: gbb  reason: default package */
public final class gbb extends p04 {
    public List w0;

    public final void E(znc znc, int i) {
        uab uab = (uab) x53.j0(i, this.w0);
        if (uab != null) {
            znc.R(new coc(new ProfileAvatarWidget(uab), (String) null, (zu3) null, (zu3) null, false, -1));
        }
    }

    public final int j() {
        return this.w0.size();
    }

    public final long k(int i) {
        uab uab = (uab) x53.j0(i, this.w0);
        Long valueOf = uab != null ? Long.valueOf(uab.a) : null;
        return (long) (valueOf != null ? valueOf.hashCode() : 0);
    }
}
