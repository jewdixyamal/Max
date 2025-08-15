package defpackage;

import java.util.Iterator;

/* renamed from: scg  reason: default package */
public final /* synthetic */ class scg implements Runnable {
    public final /* synthetic */ w5e a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ scg(w5e w5e, boolean z, boolean z2) {
        this.a = w5e;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        w5e w5e = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        a4c a4c = ((kq7) w5e.a).n;
        a4c.log("OKRTCLmsAdapter", "capture state changed, isCapturing=" + z + ", isFailedStart=" + z2);
        tv1 tv1 = ((kq7) w5e.a).r;
        if (tv1 != null) {
            if (z) {
                Iterator it = tv1.f.iterator();
                while (it.hasNext()) {
                    ((kq7) it.next()).getClass();
                }
            } else if (!z2) {
                tv1.b();
            } else {
                return;
            }
        }
        ece ece = ((kq7) w5e.a).x;
        if (ece != null) {
            ((py0) ece.a).k(w51.Z, Boolean.valueOf(z));
        }
        kq7 kq7 = (kq7) w5e.a;
        Iterator it2 = kq7.c.iterator();
        while (it2.hasNext()) {
            ((mq7) it2.next()).b(kq7);
        }
    }
}
