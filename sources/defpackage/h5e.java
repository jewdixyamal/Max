package defpackage;

import java.util.concurrent.CancellationException;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: h5e  reason: default package */
public final class h5e implements bha {
    public final /* synthetic */ StickersSearchScreen a;

    public h5e(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    public final void I(CharSequence charSequence) {
        bc7[] bc7Arr = StickersSearchScreen.u0;
        q5e n0 = this.a.n0();
        if (!tpa.f(charSequence, ((l5e) n0.w0.get()).a)) {
            vxd vxd = n0.y0;
            String str = null;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            q0e q0e = n0.Z;
            q0e.m((Object) null, new szc(1, ((szc) q0e.getValue()).b));
            if (charSequence != null) {
                str = charSequence.toString();
            }
            n0.u0.setValue(str);
        }
    }

    public final void p() {
        this.a.getRouter().C();
    }
}
