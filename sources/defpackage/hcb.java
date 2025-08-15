package defpackage;

import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: hcb  reason: default package */
public final /* synthetic */ class hcb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3g b;

    public /* synthetic */ hcb(a3g a3g, int i) {
        this.a = i;
        this.b = a3g;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.l(((Integer) obj).intValue());
                return e5f.a;
            default:
                ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.k((String) obj);
                return e5f.a;
        }
    }
}
