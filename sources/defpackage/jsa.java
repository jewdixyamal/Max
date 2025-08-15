package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: jsa  reason: default package */
public final class jsa extends j1e {
    public final /* synthetic */ int d;
    public final /* synthetic */ SessionDescription e;
    public final /* synthetic */ nsa f;

    public /* synthetic */ jsa(nsa nsa, SessionDescription sessionDescription, int i) {
        this.d = i;
        this.f = nsa;
        this.e = sessionDescription;
    }

    public final void onSetFailure(String str) {
        switch (this.d) {
            case 0:
                this.f.o(this.e, true, str);
                return;
            default:
                this.f.o(this.e, false, str);
                return;
        }
    }

    public final void onSetSuccess() {
        switch (this.d) {
            case 0:
                this.f.n(this.e, true);
                return;
            default:
                this.f.n(this.e, false);
                return;
        }
    }
}
