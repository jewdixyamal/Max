package defpackage;

import java.io.File;

/* renamed from: dq6  reason: default package */
public final class dq6 extends qy9 {
    public static final /* synthetic */ int o = 0;
    public final je7 a;
    public final File b;
    public final ztc c;

    public dq6(khe khe, File file, ztc ztc) {
        this.a = khe;
        this.b = file;
        this.c = ztc;
    }

    public final void q(f2a f2a) {
        xtc a2 = this.c.a();
        cq6 cq6 = new cq6(f2a, (khe) this.a, this.b, a2);
        f2a.c(cq6);
        if (!cq6.Y.get()) {
            ((iq6) cq6.a.getValue()).b(cq6.b, cq6.c, cq6, (String) null);
        }
    }
}
