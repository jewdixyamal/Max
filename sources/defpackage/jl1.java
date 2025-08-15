package defpackage;

import android.media.VolumeProvider;
import one.me.calls.impl.service.CallServiceImpl;

/* renamed from: jl1  reason: default package */
public final class jl1 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl1(v4b v4b, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = v4b;
    }

    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                hm9.m("CallServiceTag", "on adjust volume changed: " + i, new Object[0]);
                ((q71) ((CallServiceImpl) this.b).Y.getValue()).a();
                return;
            default:
                v4b v4b = (v4b) this.b;
                v4b.getClass();
                oaf.W(v4b.f, new u4b(v4b, i, 1, 1));
                return;
        }
    }

    public void onSetVolumeTo(int i) {
        switch (this.a) {
            case 1:
                v4b v4b = (v4b) this.b;
                v4b.getClass();
                oaf.W(v4b.f, new u4b(v4b, i, 1, 0));
                return;
            default:
                super.onSetVolumeTo(i);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl1(CallServiceImpl callServiceImpl) {
        super(1, 0, 0);
        this.b = callServiceImpl;
    }
}
