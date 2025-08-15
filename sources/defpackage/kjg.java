package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: kjg  reason: default package */
public final class kjg extends fgg {
    public final /* synthetic */ int d;
    public final /* synthetic */ qjg e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kjg(qjg qjg, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 6);
        this.d = i;
        this.e = qjg;
    }

    public void g(Status status) {
        switch (this.d) {
            case 0:
                ((tig) this.e).S(status);
                return;
            default:
                super.g(status);
                return;
        }
    }

    public void n(Status status) {
        switch (this.d) {
            case 1:
                ((tig) this.e).S(status);
                return;
            default:
                super.n(status);
                return;
        }
    }
}
