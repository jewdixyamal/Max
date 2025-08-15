package defpackage;

import java.io.IOException;

/* renamed from: dp6  reason: default package */
public final class dp6 extends mne {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ cc1 f;
    public final /* synthetic */ Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp6(String str, cc1 cc1, mec mec) {
        super(str, true);
        this.f = cc1;
        this.g = mec;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                ((kp6) this.f.c).b.a((ded) ((mec) this.g).a);
                return -1;
            default:
                try {
                    ((kp6) this.f.c).b.b((rp6) this.g);
                } catch (IOException e2) {
                    q2b q2b = q2b.a;
                    q2b.a.getClass();
                    q2b.i(4, "Http2Connection.Listener failure for " + ((kp6) this.f.c).o, e2);
                    try {
                        ((rp6) this.g).c(2, e2);
                    } catch (IOException unused) {
                    }
                }
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp6(String str, rp6 rp6, cc1 cc1) {
        super(str, true);
        this.g = rp6;
        this.f = cc1;
    }
}
