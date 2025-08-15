package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: icb  reason: default package */
public final /* synthetic */ class icb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3g b;

    public /* synthetic */ icb(a3g a3g, int i) {
        this.a = i;
        this.b = a3g;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.a();
                return e5f.a;
            case 1:
                l22 p0 = ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0();
                j47.T(p0.a, (lx3) null, (vx3) null, new j22(p0, (Continuation) null), 3);
                return e5f.a;
            default:
                ((ProfileChangeLinkScreen) ((jcb) this.b.Y)).p0().b.e();
                return e5f.a;
        }
    }
}
