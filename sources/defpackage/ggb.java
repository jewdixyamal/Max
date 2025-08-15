package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* renamed from: ggb  reason: default package */
public final /* synthetic */ class ggb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3g b;

    public /* synthetic */ ggb(a3g a3g, int i) {
        this.a = i;
        this.b = a3g;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(1, str);
                return e5f.a;
            case 1:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(2, str);
                return e5f.a;
            case 2:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(131072, str);
                return e5f.a;
            default:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.m(4, str);
                return e5f.a;
        }
    }
}
