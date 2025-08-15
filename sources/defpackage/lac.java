package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: lac  reason: default package */
public final class lac {
    public volatile vxd a;
    public long b;
    public long c;
    public final q0e d;
    public final w7c e;

    public lac() {
        q0e a2 = r0e.a((Object) null);
        this.d = a2;
        this.e = new w7c(a2);
    }

    public final void a() {
        vxd vxd = this.a;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.a = null;
        Long l = (Long) this.d.getValue();
        this.b = l != null ? l.longValue() : 0;
    }
}
