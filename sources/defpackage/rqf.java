package defpackage;

import android.media.VolumeProvider;

/* renamed from: rqf  reason: default package */
public final class rqf extends VolumeProvider {
    public final /* synthetic */ v4b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rqf(v4b v4b, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = v4b;
    }

    public final void onAdjustVolume(int i) {
        v4b v4b = this.a;
        v4b.getClass();
        oaf.W(v4b.f, new u4b(v4b, i, 1, 1));
    }

    public final void onSetVolumeTo(int i) {
        v4b v4b = this.a;
        v4b.getClass();
        oaf.W(v4b.f, new u4b(v4b, i, 1, 0));
    }
}
