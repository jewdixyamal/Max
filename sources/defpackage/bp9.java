package defpackage;

import android.view.ViewGroup;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: bp9  reason: default package */
public final /* synthetic */ class bp9 implements em {
    public final /* synthetic */ NeuroAvatarsScreen a;

    public /* synthetic */ bp9(NeuroAvatarsScreen neuroAvatarsScreen) {
        this.a = neuroAvatarsScreen;
    }

    public final void V(fm fmVar, int i) {
        bc7[] bc7Arr = NeuroAvatarsScreen.M0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.a;
        float interpolation = neuroAvatarsScreen.y0.getInterpolation(((float) Math.abs(i)) / ((float) neuroAvatarsScreen.m0().getTotalScrollRange()));
        bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
        ((ViewGroup) neuroAvatarsScreen.Z.T0(neuroAvatarsScreen, bc7Arr2[2])).setAlpha(1.0f - interpolation);
        ((cla) neuroAvatarsScreen.t0.T0(neuroAvatarsScreen, bc7Arr2[4])).setTitleAlpha(interpolation);
    }
}
