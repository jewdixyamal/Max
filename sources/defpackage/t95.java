package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: t95  reason: default package */
public final class t95 extends pnf {
    public vxd X;
    public final je7 b;
    public final je7 c;
    public final s35 o = new s35(0);

    public t95() {
        l95 l95 = l95.a;
        khe d = l95.getAccessor().d(ome.class);
        khe d2 = l95.getAccessor().d(kke.class);
        this.b = d;
        this.c = d2;
    }

    public final void p() {
        vxd vxd = this.X;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.X = null;
    }
}
