package defpackage;

import one.me.profileedit.ProfileEditScreen;

/* renamed from: hgb  reason: default package */
public final /* synthetic */ class hgb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3g b;

    public /* synthetic */ hgb(a3g a3g, int i) {
        this.a = i;
        this.b = a3g;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(64);
                return e5f.a;
            case 1:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(128);
                return e5f.a;
            case 2:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(256);
                return e5f.a;
            default:
                ((ProfileEditScreen) ((igb) this.b.Y)).n0().b.a(512);
                return e5f.a;
        }
    }
}
