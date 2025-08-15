package defpackage;

import android.content.Context;
import org.webrtc.EglBase;

/* renamed from: fwc  reason: default package */
public final class fwc implements nq7 {
    public l26 X;
    public volatile z26 Y;
    public volatile boolean Z = false;
    public final a4c a;
    public final mu3 b;
    public volatile boolean c;
    public h26 o;
    public final dwc s0 = new dwc(this, 2);

    public fwc(EglBase.Context context, Context context2, a4c a4c, u5e u5e, dnc dnc) {
        mu3 mu3 = new mu3("SSSendControl");
        this.b = mu3;
        this.a = a4c;
        mu3.c(new ws4(this, context, context2, u5e, a4c, dnc, 1));
    }

    public final void a(int i, int i2) {
        this.b.c(new ft0(this, i, i2, 3));
    }
}
