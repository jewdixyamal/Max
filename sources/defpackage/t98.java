package defpackage;

import androidx.media3.common.PlaybackException;

/* renamed from: t98  reason: default package */
public final /* synthetic */ class t98 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaybackException b;

    public /* synthetic */ t98(int i, PlaybackException playbackException) {
        this.a = i;
        this.b = playbackException;
    }

    public final void invoke(Object obj) {
        n3b n3b = (n3b) obj;
        switch (this.a) {
            case 0:
                n3b.r0(this.b);
                return;
            case 1:
                n3b.x0(this.b);
                return;
            case 2:
                n3b.r0(this.b);
                return;
            default:
                n3b.x0(this.b);
                return;
        }
    }
}
