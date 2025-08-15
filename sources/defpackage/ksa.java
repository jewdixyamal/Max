package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: ksa  reason: default package */
public final class ksa extends j1e {
    public final /* synthetic */ int d;
    public final /* synthetic */ nsa e;

    public /* synthetic */ ksa(nsa nsa, int i) {
        this.d = i;
        this.e = nsa;
    }

    public final void onCreateFailure(String str) {
        switch (this.d) {
            case 0:
                this.e.h(str);
                return;
            default:
                this.e.h(str);
                return;
        }
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.d) {
            case 0:
                this.e.m(sessionDescription);
                return;
            default:
                this.e.m(sessionDescription);
                return;
        }
    }
}
