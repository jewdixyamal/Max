package defpackage;

import android.media.AudioTrack;

/* renamed from: b84  reason: default package */
public final class b84 extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b84(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        v75 v75;
        e84 e84;
        qqd qqd;
        w75 w75;
        switch (this.a) {
            case 0:
                nw4 nw4 = (nw4) this.b;
                np8.f(audioTrack == ((d84) nw4.o).u);
                d84 d84 = (d84) nw4.o;
                w4d w4d = d84.r;
                if (w4d != null && d84.U && (v75 = ((u78) w4d.b).a2) != null) {
                    v75.a.s0.c(2);
                    return;
                }
                return;
            default:
                c84 c84 = (c84) this.b;
                if (audioTrack.equals(c84.c.w) && (qqd = e84.s) != null && (e84 = c84.c).Y && (w75 = ((v78) qqd.b).R0) != null) {
                    w75.a();
                    return;
                }
                return;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.a) {
            case 1:
                c84 c84 = (c84) this.b;
                if (audioTrack.equals(c84.c.w)) {
                    c84.c.X = true;
                    return;
                }
                return;
            default:
                super.onPresentationEnded(audioTrack);
                return;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        v75 v75;
        e84 e84;
        qqd qqd;
        w75 w75;
        switch (this.a) {
            case 0:
                nw4 nw4 = (nw4) this.b;
                np8.f(audioTrack == ((d84) nw4.o).u);
                d84 d84 = (d84) nw4.o;
                w4d w4d = d84.r;
                if (w4d != null && d84.U && (v75 = ((u78) w4d.b).a2) != null) {
                    v75.a.s0.c(2);
                    return;
                }
                return;
            default:
                c84 c84 = (c84) this.b;
                if (audioTrack.equals(c84.c.w) && (qqd = e84.s) != null && (e84 = c84.c).Y && (w75 = ((v78) qqd.b).R0) != null) {
                    w75.a();
                    return;
                }
                return;
        }
    }
}
