package defpackage;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: dwc  reason: default package */
public final /* synthetic */ class dwc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwc b;

    public /* synthetic */ dwc(fwc fwc, int i) {
        this.a = i;
        this.b = fwc;
    }

    public final void run() {
        int i = this.a;
        fwc fwc = this.b;
        switch (i) {
            case 0:
                if (fwc.Z) {
                    h26 h26 = fwc.o;
                    if (h26 != null) {
                        h26.o.c(new g26(h26, 0));
                    }
                    l26 l26 = fwc.X;
                    if (l26 != null) {
                        l26.c.c(new k26(l26, 1));
                    }
                    if (fwc.Y != null) {
                        fwc.Y.c(false);
                    }
                }
                h26 h262 = fwc.o;
                if (h262 != null) {
                    h262.Z = null;
                    h262.o.a(new g26(h262, 1));
                }
                l26 l262 = fwc.X;
                if (l262 != null) {
                    l262.c.c(new k26(l262, 1));
                    l262.c.a(new k26(l262, 2));
                }
                if (fwc.Y != null) {
                    fwc.Y.c(false);
                }
                h26 h263 = fwc.o;
                if (h263 != null) {
                    mu3 mu3 = h263.o;
                    mu3.getClass();
                    try {
                        ((CountDownLatch) mu3.d).await();
                    } catch (InterruptedException unused) {
                    }
                }
                fwc.o = null;
                fwc.X = null;
                fwc.Y = null;
                fwc.c = true;
                return;
            case 1:
                h26 h264 = fwc.o;
                if (h264 != null) {
                    h264.o.c(new g26(h264, 0));
                }
                l26 l263 = fwc.X;
                if (l263 != null) {
                    l263.c.c(new k26(l263, 1));
                }
                if (fwc.Y != null) {
                    fwc.Y.c(false);
                    return;
                }
                return;
            default:
                double b2 = fwc.o.s0.b();
                double b3 = fwc.X.u0.b();
                double b4 = fwc.X.v0.b();
                double b5 = fwc.Y.f.b();
                a4c a4c = fwc.a;
                a4c.log("SSStat", "capturer: " + b2 + " , encoder: " + b3 + " | " + b4 + " , sender: " + b5);
                mu3 mu32 = fwc.b;
                ((Handler) mu32.b).postDelayed(fwc.s0, 1000);
                return;
        }
    }
}
